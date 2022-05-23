import java.util.Scanner;

public class Loopfor {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

// "반복" 문자열 5번 출력하기		
		for (int i=0; i<5; i++) {
			System.out.println("반복");
		}
		
// 10~99 중 10의자리수와 1의자리수의 합이 7인 수만 출력
		for (int i=10; i<=99; i++) {
			if (i%10+i/10==7) {
		    System.out.println(i);
			}
		}
		
// 1부터 10까지 출력하기
        for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		for (int i=21; i<=30; i+=3) {
			System.out.println(i);
		}
		
		for (int i=30; i>=20; i--) {
		System.out.println(i);
		}
		

		
	}
}
		
		