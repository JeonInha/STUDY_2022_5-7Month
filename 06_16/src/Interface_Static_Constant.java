interface Days {
	public static final int NUM=10;
	// 인터페이스 안에는 추상메소드와 상수가 들어갈 수 있음.
	// 상수를 변수처럼 선언할 수 있음. 모든 수가 상수이기때문에.
	int MONDAY=1;
	int TUESDAY=2;
	int WEDNESDAY=3;
	int THURSDAY=4;
	int FRIDAY=5;
	int SATURDAY=6;
	int SUNDAY=7;
}

interface MyInterface {
	public static final int NUM=10; // 상수 선언
	int MONDAY=1; // 상수를 축약형으로 선언
	
	default void printHello() {	// 디폴트 메소드
		System.out.println("Hello");
	}
	
	static void myStaticMethod() {	// 정적 메소드
		System.out.println("aaaaa");
	}
}


public class Interface_Static_Constant implements MyInterface {
	public static void main(String[] args) {
		System.out.println(Days.NUM);	// 상수 사용
		Interface_Static_Constant a = new Interface_Static_Constant();
		a.printHello();	// 디폴트 메소드 사용
		new Interface_Static_Constant().printHello(); //이렇게도 사용할 수 있구
		MyInterface.myStaticMethod();	// 정적 메소드 사용
	}
}
