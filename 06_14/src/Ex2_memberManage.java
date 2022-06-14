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
	private int memberNum;
	private String state;

	public ClubMember(String name, double tall, double weight, int memberNum) {
		super(name, tall, weight);
		this.memberNum = memberNum;
	}

	public ClubMember(String name, double tall, double weight, int memberNum, String state) {
		super(name, tall, weight);
		this.memberNum = memberNum;
		this.state = state;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
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
		return String.format("| %02d | %s\t%.2f\t%.2f\t%s", memberNum, getName(), getTall(), getWeight(), state);
	}
}

////////////////////////////////////////////////////////

class Manage {
	Scanner sc = new Scanner(System.in);
	ClubMember[] club = new ClubMember[10];
	
			
			
	private void printAllMembers(ClubMember[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null)
				continue;
			System.out.println(a[i]);
		}
		System.out.println("출력 완료");
	}

	private ClubMember[] arrayBMI(ClubMember[] a) {
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
		boolean bool = false;
		boolean bool2 = false;
		for (int i = 0; i < 10; i++) { // 중복 판별
			if (input.equals(club[i])) {
				System.out.println("중복 등록은 불가합니다.");
				bool = true;
				break;
			}
		}
		if (bool == false) { // 중복 판별 통과했을 때 등록
			for (int i = 0; i < 10; i++) {
				if (club[i] == null) {
					club[i] = new ClubMember(input.getName(), input.getTall(), input.getWeight(), i + 1);
					club[i].setState(club[i].obesityJudge());
					bool2 = true;
					break;
				}
			}
		}
		if (bool2 == false)
			System.out.println("정원이 다 찼습니다. 등록이 불가합니다.");
	}

	public void manage() {
		club[0] = new ClubMember("a", 182, 77, 1, "경도비만");
		club[1] = new ClubMember("b", 155, 43, 2, "저체중");
		club[2] = new ClubMember("c", 165, 55, 3, "정상");
		club[3] = new ClubMember("d", 171, 60, 4, "정상");
		club[4] = new ClubMember("e", 186, 80, 5, "경도비만");
		club[5] = new ClubMember("f", 166, 60, 6, "정상");
		club[6] = new ClubMember("g", 145, 55, 7, "중도비만");
		club[7] = new ClubMember("h", 178, 66, 8, "정상");
		int num = 0;
		while (true) {
			if (num == 1) {
				System.out.println("회원 정보 출력");
				printAllMembers(arrayBMI(club));
				num = 0;
			} else if (num == 2) {
				System.out.println("회원 신규 등록");
				registMember(inputHuman());
				num = 0;
			} else if (num == 3) {
				System.out.println("회원 삭제");
				num = 0;
			} else if (num == 4) {
				System.out.println("회원 정보 수정");
				num = 0;
			} else if (num == 0) {
				System.out.println("====================");
				System.out.println("1. 회원 정보 열람");
				System.out.println("2. 회원 신규 등록");
				System.out.println("3. 회원 삭제");
				System.out.println("4. 회원 정보 수정");

				System.out.println("9. 회원 삭제");
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
		Manage ma = new Manage();
		ma.manage();
	}
}
