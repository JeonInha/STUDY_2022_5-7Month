import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();
	Class c = new Class(s1, s2, s3);  // students 클래스를 먼저 만드는 서순 (반대로 하면 참조할 객체가 없어서 안돌아감
	String yn;


	public void printInfor() {	// 학생 이름을 입력받아 정보 출력
		System.out.print("정보를 조회할 학생 이름 입력: ");
		yn = sc.next();
		if (yn.equals(s1.getName()))
			s1.printAll();
		else if (yn.equals(s2.getName()))
			s2.printAll();
		else if (yn.equals(s3.getName()))
			s3.printAll();
		else
			System.out.println("잘못된 입력입니다.");
	}

	public int expPrgm(int i) {  // 설명 페이지
		System.out.println("------------------------------");
		System.out.println("1: 학생 정보 조회     2: 학급의 모든 학생 이름 조회     3: 학급 평균 점수 열람");
		System.out.println("4: 최우수학생 조회     5: 학생 정보 다시 입력     6: 프로그램 설명     7: 프로그램 종료");
		System.out.println("번호를 입력하세요");
		int x;
		while (true) {
			x = sc.nextInt();
			if (1 <= x || x <= 6)
				break;
			else
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}
		return x;
	}

	public void inputStudent() {	//세 학생 정보 입력받기
		for (int i = 1; i <= 3; i++) {
			System.out.printf("%d번 학생 정보를 입력하시겠습니까? y/n\n", i);
			yn = sc.next();
			if (yn.equals("y")) {
				if (i == 1)
					s1.inputSInfor();
				if (i == 2) 
					s2.inputSInfor();
				if (i == 3)  
					s3.inputSInfor();
			} else if (yn.equals("n")) {
				System.out.printf("%d번 학생 정보 입력 건너뛰기\n", i);
			} else {
				System.out.println("잘못된 입력입니다.");
				i--;
				continue;
			}
		}
	}
	
	public void printBestS() {	// 평균점수가 가장 높은 학생 출력
		System.out.print(c.comparAvg().getName());	//평균점수가 가장 높은 학생의 이름
		c.ifToMany1st();	// 동점자 출력
		System.out.printf(" (평균 점수: %.3f)\n", c.comparAvg().getAvg());		//평균점수 출력
	}

	public static void main(String[] args) {
		System.out.println("******************************");
		System.out.println("*********학생관리프로그램*********");
		System.out.println("******************************");
		Main t = new Main();

		System.out.println("학생 정보 초기입력");
		t.inputStudent();
		int i = 6;
		while (true) {
			System.out.println("------------------------------");
			if (i == 1) {
				System.out.println("1: 학생 정보 조회 "); 
				t.printInfor();
				i = 6;
			}
			if (i == 2) {
				System.out.println("2: 학급의 모든 학생 이름 조회"); 
				t.c.printAllName();
				i = 6;
			}
			if (i == 3) {
				System.out.println("3: 학급 평균 점수 열람"); 
				System.out.println(t.c.printAlAvg());
				i = 6;
			}
			if (i == 4) {	
				System.out.println("4: 최우수학생 조회 ");
				t.printBestS();
			i = 6;
			}
			if (i == 5) {
				System.out.println("5: 학생 정보 다시 입력"); 
				t.inputStudent();
				i = 6;
			}
			if (i == 6) { 
				i=t.expPrgm(i);	// 프로그램 설명
			}
			if (i == 7)	//프로그램 종료
				break;
		}
		System.out.println("******************************");
		System.out.println("프로그램을 종료하였습니다.");		
		

	}

}
