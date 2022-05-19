import java.util.Scanner;

public class Ex03 {
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);

		
		System.out.println("********");
		System.out.println("Q1. 입력한 정수는 0 이상이며 7의 배수인가?");
		
		System.out.print("입력: ");
		int a1 = sc.nextInt();
		System.out.println("결과: "+(a1>=0 && a1%7==0));
		
		
		
		
		System.out.println("********");
		System.out.println("Q2. 입력한 세 정수는 오름차순인가?");
		System.out.print("입력1: ");
		int a2 = sc.nextInt();
		System.out.print("입력2: ");
		int b2 = sc.nextInt();
		System.out.print("입력3: ");
		int c2 = sc.nextInt();
		System.out.println("결과: "+(a2<=b2&&b2<=c2));
		
		
		
		
		System.out.println("********");
		System.out.println("Q3. 입력한 4자리 정수는 회문인가?");
		System.out.print("입력: ");
		int a3 = sc.nextInt();
		
		int n1, n2, n3, n4;
		n1 = a3/1000;
		n2 = a3/100%10;
		n3 = a3/10%10;
		n4 = a3%10;
		System.out.println("결과: "+(n1==n4&&n2==n3));
		
	}
}