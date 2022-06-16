import java.util.*;

class StudentS {
	String name;
	double gpa; // 학점

	public StudentS(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}
}

public class NonameClass {
	public static void main(String[] args) {
		StudentS[] class1 = new StudentS[3];
		class1[0] = new StudentS("홍길동", 3.39);
		class1[1] = new StudentS("임꺽정", 4.21);
		class1[2] = new StudentS("황진이", 2.19);

		Comparator<StudentS> nameCom = new Comparator<StudentS>() {
			// 익명 클래스를 참조한 변수 nameCom
			// 변수이름: namecom;
			// 자료형을 인터페이스로 두었음
			// 상속도 가능.
			// 업캐스팅한 인터페이스의 형으로 씀?
			@Override
			public int compare(StudentS o1, StudentS o2) {
				return o1.name.compareTo(o2.name);
			}
		};

		Arrays.sort(class1, nameCom);

		Arrays.sort(class1, new Comparator<StudentS>() {
			@Override
			public int compare(StudentS o1, StudentS o2) {
				return o1.name.compareTo(o2.name);
			}
		}/* 여기까지가 T */
		); // 이렇게도 쓸 수 있음 완전 1회용!!

		// 추상 클래스, 인터페이스를 보통 1회용 클래스로 만들어서 씀.

		for (StudentS s : class1)
			System.out.printf("%s, %.2f\n", s.name, s.gpa);
	}
}