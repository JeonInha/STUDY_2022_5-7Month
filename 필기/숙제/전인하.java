import java.util.Scanner;

public class Fibonacci_Inha {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("피보나치수열 출력");
		int num1=1; // 뒷숫자
		int num2=1; // 출력숫자
		int sp; // 저장용
		System.out.println(num2); //첫번째 숫자는 그냥 출력
		
		while (num2<=100) {
			System.out.println(num2);
			sp=num1+num2; //저장해두기
			num1=num2; // 숫자 뒤로 밀기
			num2=sp; // 새 숫자 입력
			}
			
		System.out.println("*END*");
	}
}