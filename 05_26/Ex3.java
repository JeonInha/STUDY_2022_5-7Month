import java.util.Scanner;

public class Ex3 {
	
	public static double printCircle(double r) {	
		return Math.PI*r*r;
	}
	
	public static void hello(int x) {
		for (int i=0; i<x; i++) {
		System.out.print("안녕! ");
		}
	}
	
	public static int lengthsum(String a, String b) {
		int x=a.length();
		int y=b.length();
		return x+y;
	}
	
	//키(미터)와 몸무게(kg) 전달받아 한국 기준 BMI를 구해 반환하는 메소드
	//BMI=(무게)/키*키
	public static double bmi(double w, double h) {
		return w/(h*h);
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("반지름 입력 ");
		double x=sc.nextDouble();
		System.out.println(printCircle(x));
		
		
		
		System.out.println("\n\n====================");
		System.out.print("안녕 횟수 입력 ");
		int y=sc.nextInt();
		hello(y);
		
		
		
		System.out.println("\n\n====================");
		System.out.print("문장 1 입력: ");
		sc.nextLine();
		String s1=sc.nextLine();
		System.out.print("문장 2 입력: ");
		String s2=sc.nextLine();
		System.out.println("문자열 길이 합: "+lengthsum(s1, s2));
		
		
		
		System.out.println("\n\n====================");
		double w, h;
		System.out.print("키 입력(미터 단위): ");
		do {
			h=sc.nextDouble();
			if (h>2.5) {
			System.out.print("미터법으로 입력하세요");
			} else break;
		} while (true);
		System.out.print("몸무게 입력(kg 단위): ");
		w=sc.nextDouble();
		System.out.println("BMI: "+bmi(w, h));
	}
}