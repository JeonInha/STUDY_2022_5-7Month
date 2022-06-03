import java.util.Calendar;

public class ExStatic {
	
	static {
		System.out.println("스태틱 블록 안입니다");
	}
	int number;
	static int staticNumber;
	
	public void print() {
		System.out.println("non-static");
	}
	
	public static void printStatic() {
		System.out.println("static");
	}
	public static void main(String[] args) {
		// java.util.Callenger
		
		Calendar today= Calendar.getInstance();
		// calender는 메소드 안에서 new 를 하고 있고 그 참조를 반환함. 그래서 new를 쓸 필요가 없음.
		// 이건 
		//1.8 ~~ java.time.LocalDate
		
		ExStatic.staticNumber=10;
		ExStatic.printStatic();
		// static(정적): 클래스를 로드하는 시점에서 이미 만들어짐.
		
		
		ExStatic main=new ExStatic();
		// non-static: 참조변수를 선언할 때 만들어짐.
		main.print();
		ExStatic main2=new ExStatic();
		ExStatic main3=new ExStatic();
		
		
		
		
		
	}
}
