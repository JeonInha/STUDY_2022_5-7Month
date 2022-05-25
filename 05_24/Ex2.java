import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		// Fizz Buzz
		// 3의 배수 Fizz
		// 5의 배수 Buzz
		// 3의 배수면서 5의 배수면 Fizz Buzz
		// 35까지
		
		System.out.println("Fizz Buzz Game");
		for (int i=1; i<=35; i++) {
			if(i%3==0&&i%5==0) {
			System.out.println("!Fizz Buzz!");
			} else if (i%3==0) {
			System.out.printf("Fizz, ");
			} else if (i%5==0) {
			System.out.printf("Buzz, ");	
			} else {
			System.out.printf("%d, ", i);
			}
		}
		
		
		// 피보나치 수열 (검색하자 ...) 100까지 출력
		System.out.println("\n\n================================");
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
		
		
		
		// 사용자가 입력한 정수가 소수인지 확인하여 출력하는 프로그램
		System.out.println("\n\n================================");
		System.out.println("======이 정수는 소수일까?=======");
		System.out.print("정수 입력: ");
		Long input=sc.nextLong();
		Long div;
		
		for (int i=1; i<input; i++) {  //1부터 input까지 루프로 나눗셈을 돌려 소수인지 확인 
			i++;
			div=input%i; //나머지
			if (input==2) break;
			if (div==0) { //나머지가 없다면=소수가 있다면 프로그램 셧다운
			 System.out.printf("소수가 아닙니다. 소수 예시: %d", i);
			 return;
			}
		}
		System.out.printf("소수가 맞습니다!");
	}
}