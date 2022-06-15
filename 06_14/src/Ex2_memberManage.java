import java.util.Arrays;
import java.util.Scanner;

// 회원 관리 프로그램
// 회원을 콘솔입력으로 등록할 수 있게, 최대 10명
// 중복등록이 되면 안됨.
// 중복 기준: 이름, 키, 몸무게가 동일하면 중복처리
// 기준에 따라 집계를 해서 목록을 보여줘야 함 (기준: 비만도)

class Human {
	private String name;
	private double tall;
	private double weight;

	public Human(String name, double tall, double weight) {
		this.name = name;
		this.tall = tall;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human input = (Human) obj; // 다운캐스팅
			return name.equals(input.name) && tall == input.tall && weight == input.weight;
		} else
			return false;
	}
}

/////////////////////////////////

class ClubMember extends Human {
	private String state;
	private double bmi;

	public ClubMember(String name, double tall, double weight) {
		super(name, tall, weight);
		state=obesityJudge();
		bmi=getBMI();
	}

	public ClubMember(String name, double tall, double weight, String state) {
		super(name, tall, weight);
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getBMI() {
		return getWeight() / ((getTall() / 100) * (getTall() / 100));
	}

	public String obesityJudge() {
		if (getBMI() >= 35) {
			return "고도비만";
		} else if (getBMI() >= 30) {
			return "중도비만";
		} else if (getBMI() >= 25) {
			return "경도비만";
		} else if (getBMI() >= 23) {
			return "과체중";
		} else if (getBMI() >= 18.5) {
			return "정상";
		} else
			return "저체중";
	}

	@Override
	public String toString() {
		return String.format(" %s\t | %.2f\t%.2f\t%.2f\t%s", getName(), getTall(), getWeight(), getBmi(), state);
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
}

////////////////////////////////////////////////////////

class Manage {
	Scanner sc = new Scanner(System.in);
	ClubMember[] club = new ClubMember[10];
	
	public Manage() {
		manage();
	}
	
			
			
	private void printAllMembers(ClubMember[] a) {
		System.out.printf("[회원 수: %d]\n", a.length);
		System.out.println("-----------------------------------------------");
		System.out.println(" 이름\t | 키\t\t몸무게\tBMI\t상태");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null)
				continue;
			System.out.println(a[i]);
		}
		System.out.println("-----------------------------------------------");
	}
	
	private void arrayNullRight() {	// Null을 오른쪽으로 밀어버리는 로직
			for (int i=0; i<club.length; i++) {
			for (int j=0; j<club.length-1; j++) {
				if (club[j]==null) {
					ClubMember x = club[j];
					club[j] = club[j+1];
					club[j+1] = x;
				}
			}
		}
	}

	private ClubMember[] arrayBMI(ClubMember[] a) {		// BMI순으로 정리하는 로직
		int countNull=0;
		for (int i=0; i<a.length; i++) {
			if (a[i]==null) 
				countNull++;
		}
		ClubMember[] copy = Arrays.copyOf(a, a.length-countNull);
		for (int i=0; i<copy.length; i++) {
			for (int j=0; j<copy.length-1; j++) {
				if (copy[j].getBMI()<copy[j+1].getBMI()) {
					ClubMember x = copy[j];
					copy[j] = copy[j+1];
					copy[j+1] = x;
				}
			}
		}
		return copy;
	}

	private Human inputHuman() {
		System.out.print("신상정보를 입력하세요. 이름 / 키(cm) / 몸무게(kg):  ");
		String inputName = sc.next();
		double inputTall = sc.nextDouble();
		double inputWeight = sc.nextDouble();
		return new Human(inputName, inputTall, inputWeight);
	}

	private void registMember(Human input) {
		boolean doppelganger = false;
		boolean full = true;
		for (int i = 0; i < 10; i++) { // 중복 판별
			if (input.equals(club[i])) {
				System.out.println("중복 등록은 불가합니다.");
				full=false;
				doppelganger= true;
				break;
			}
		}
		if (doppelganger == false) { // 중복 판별 통과했을 때 등록
			for (int i = 0; i < 10; i++) {
				if (club[i] == null) {
					club[i] = new ClubMember(input.getName(), input.getTall(), input.getWeight());
					club[i].setState(club[i].obesityJudge());
					full = false;
					break;
				}
			}
		}
		if (full == true)
			System.out.println("정원이 다 찼습니다. 등록이 불가합니다.");
	}
	
	private void deleteMember() {
		int count=0;
		System.out.print("지울 회원의 정보 입력");
		Human delete=inputHuman();
		for (int i=0; i<club.length; i++) {
			if (delete.equals(club[i])) {
				System.out.printf("%s 회원의 정보를 삭제합니다.\n", club[i].getName());
				club[i]=null;
				count++;
			}
		}
		if (count==0)
			System.out.println("등록되지 않은 회원입니다.");
		arrayNullRight();
	}
	
	private void editMember() {
		int count=0;
		System.out.println("수정할 회원의 정보 입력");
		Human input=inputHuman();
		for (int i=0; i<club.length; i++) {
			if (input.equals(club[i])) {
				club[i]=null;
				count++;
				System.out.println("회원의 수정 정보 입력");
				Human edit=inputHuman();
				club[i]= new ClubMember(edit.getName(), edit.getTall(), edit.getWeight());
			}
		}
		if (count==0) {
			System.out.println("등록되지 않은 회원입니다.");
			return;
		} 
	}

	private void manage() {
		club[0] = new ClubMember("Abert", 182, 77);
		club[1] = new ClubMember("Mike", 155, 42);
		club[2] = new ClubMember("Clair", 165, 55);
		club[3] = new ClubMember("Mclain", 171, 60);
		club[4] = new ClubMember("Luna", 186, 80);
		club[5] = new ClubMember("Tomy", 166, 60);
		club[6] = new ClubMember("Losa", 145, 55);
		club[7] = new ClubMember("Jina", 178, 66);
		int num = 0;
		
		while (true) {
			if (num == 1) {
				System.out.println("회원 정보 열람");
				printAllMembers(arrayBMI(club));
				num = 0;
			} else if (num == 2) {
				System.out.println("회원 신규 등록");
				registMember(inputHuman());
				num = 0;
			} else if (num == 3) {
				System.out.println("회원 삭제");
				deleteMember();
				num = 0;
			} else if (num == 4) {
				System.out.println("회원 정보 수정");
				editMember();
				num = 0;
			} else if (num == 0) {
				System.out.println("====================");
				System.out.println("1. 회원 정보 열람");
				System.out.println("2. 회원 신규 등록");
				System.out.println("3. 회원 삭제");
				System.out.println("4. 회원 정보 수정");

				System.out.println("9. 프로그램 종료");
				System.out.println("--------------------");
				System.out.print("입력: ");
				num = sc.nextInt();
				System.out.println("====================");
			}

			else if (num == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}

			else {
				System.out.println("잘못된 입력");
				num = 0;
			}
		}
	}
}

public class Ex2_memberManage {
	public static void main(String[] args) {
		new Manage();
	}
}
