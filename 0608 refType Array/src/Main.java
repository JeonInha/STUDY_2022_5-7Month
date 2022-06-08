import java.util.Scanner;

class Manage {
	private Scanner sc = new Scanner(System.in);
	String input;
	
	private void inputStudent(Student[] s) {	// 모든 학생 정보 입력받기
		for (int i=0; i<s.length; i++) {
			System.out.printf("%d번 학생 정보를 입력하시겠습니까? y/n\n", i+1);
			String input = sc.next();
			if (input.equals("y")) {
				
				System.out.print("학생 이름 입력: ");
				s[i].setName(sc.next());
				System.out.printf("%s 학생의 국어/영어/수학 점수 입력: ", s[i].getName());
				s[i].setKo(sc.nextInt());
				s[i].setEg(sc.nextInt());
				s[i].setMt(sc.nextInt());
				
			} else if (input.equals("n")) {
				System.out.printf("%d번 학생 정보 입력 건너뛰기\n", i+1);
			} else {
				System.out.println("잘못된 입력입니다.");
				i--;
				continue;
			}
		}
	}


	private void printAll(Student s) {	// 학생 하나의 정보를 전부 출력하는 메소드
		System.out.printf("학생 이름: %s\n", s.getName());
		System.out.printf("국어 점수: %s\n", s.getKo());
		System.out.printf("영어 점수: %s\n", s.getEg());
		System.out.printf("수학 점수: %s\n", s.getMt());
		System.out.printf("평균 점수: %f\n", s.getAvg());
	}
	
	
	private void printAllName(Student[] c) { // print메소드로 학생들의 이름을 출력
		for (int i=0; i<c.length; i++)
		System.out.printf("학생 %d: %s\n", i+1, c[i].getName());
	}

	private double printAlAvg(Student[] s) { // 평균값을 실수형으로 구함.
		int sum=0;
		for (Student value : s) {
			sum+=value.getAvg();
		}
		return ((double)sum)/s.length;
	}
	
	private double getBestAvg(Student[] s) { // 평균 1등 학생을 구하기. 출석번호가 빠른 친구를 우선순위로. return타입은 학생 클래스의 객체로.
		Student bestS=s[0];
		for (int i=1; i<s.length; i++) {
			bestS=(bestS.getAvg()>=s[i].getAvg()) ? bestS : s[i];
		}
		return bestS.getAvg();
	}
	
	private void printBestS(Student[] s) { // 번외: 동점자 출력. return값 갯수에 변동이 있는 것은 할 수 없어 문자열 출력으로 처리)
		for (int i=0; i<s.length; i++) {
			if (s[i].getAvg()==getBestAvg(s))
				System.out.printf("%s, ", s[i].getName());
		}
		System.out.printf("(평균 점수: %f)\n", getBestAvg(s));
	}

	private void printInfor(Student[] s) {	// 학생 이름을 입력받아 정보 출력
		System.out.print("정보를 조회할 학생 번호 입력: ");
		int ini = sc.nextInt();
			if (ini>=0&&ini<s.length) {
				printAll(s[ini-1]);
			} else System.out.println("잘못된 입력입니다.");
	}

	private int expPrgm(int i) {  // 설명 페이지
		System.out.println("------------------------------");
		System.out.println("1: 학생 정보 조회     2: 학급의 모든 학생 이름 조회     3: 학급 평균 점수 열람");
		System.out.println("4: 최우수학생 조회     5: 학생 정보 다시 입력     6: 프로그램 종료");
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
	
	public void manage() { // 메인 프로그램
		
		System.out.println("******************************");
		System.out.println("*********학생관리프로그램*********");
		System.out.println("******************************");

		System.out.println("학생 정보 초기입력");
		System.out.println("학급의 학생 수: ");
		int a=sc.nextInt();
		Student[] c1 = new Student[a];
		for (int i=0; i<a; i++) 
			c1[i]=new Student();
		
		
		inputStudent(c1);
		int i = 0;
		while (true) {
			System.out.println("------------------------------");
			if (i == 1) {
				System.out.println("1: 학생 정보 조회 "); 
				printInfor(c1);
				i = 0;
			}
			if (i == 2) {
				System.out.println("2: 학급의 모든 학생 이름 조회"); 
				printAllName(c1);
				i = 0;
			}
			if (i == 3) {
				System.out.println("3: 학급 평균 점수 열람"); 
				System.out.println(printAlAvg(c1));
				i = 0;
			}
			if (i == 4) {	
				System.out.println("4: 최우수학생 조회 ");
				printBestS(c1);
				i = 0;
			}
			if (i == 5) {
				System.out.println("5: 학생 정보 다시 입력"); 
				inputStudent(c1);
				i = 0;
			}
			if (i == 6) { 
				break;	// 프로그램 종료
			}
			if (i == 0)	//프로그램 설명
				i=expPrgm(i);
			
			if (i<=0&&i>6) {
				System.out.println("잘못된 입력");
				i=0;
			}
		}
		System.out.println("******************************");
		System.out.println("프로그램을 종료하였습니다.");		
		
	}
}

public class Main {	// 메인 메소드. 실행부.
	public static void main(String[] args) {
		Manage t = new Manage();
		t.manage();
	}
}
