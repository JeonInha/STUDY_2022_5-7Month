import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, sum;
		
		System.out.print("정수 1을 입력하세요 :");
		a=sc.nextInt();
		
		System.out.print("정수 2를 입력하세요 :");
		b=sc.nextInt();
		
		sum=a+b;
		boolean result = sum==0;
		
		System.out.println("두 정수의 합은 "+sum);
		System.out.println("두 수의 합이 0인가? "+(sum==0));
		
		
		System.out.println("********************");
		
		System.out.print("다른 정수를 입력하세요 :");
		int num =sc.nextInt();
		System.out.println("이 정수는 짝수인가? "+(num%2==0));
		
		
		System.out.println("********************");
		
		int ben, sq, dead;
		System.out.print("벤치프레스:");
		ben =sc.nextInt();
		System.out.print("스쿼트:");
		sq =sc.nextInt();
		System.out.print("데드리프트:");
		dead =sc.nextInt();
		System.out.println("언더아머 입어도 되나? "+(ben+sq+dead>=500));
		
		int num2 = 33;
		System.out.println("num2는 0과 100 사이에 있는가?");
		System.out.println(0<=num2&&num<=100);
	}
}
		