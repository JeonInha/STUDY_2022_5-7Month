import java.util.Scanner;

public class IfStudy {
	public static void main(String[] args)  {
	
	boolean condition = true;
	
	if (condition) {
		System.out.println("조건문 블록 안입니다.");
	}
	System.out.println("프로그램 종료");
	
	Scanner sc=new Scanner(System.in);
	int a;
	System.out.print("정수 입력: ");
	a=sc.nextInt();
	if (a%2==0&&a!=0) {
	  System.out.println("입력한 정수는 짝수입니다.");
	  } else {
		System.out.println("입력한 정수는 홀수입니다.");
	  }
		
	}
}