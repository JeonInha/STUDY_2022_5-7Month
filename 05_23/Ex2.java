import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("출력하고자 하는 구구단이 몇 단인지 입력: ");
		int a = in.nextInt();	
		System.out.print("몇 열까지 출력하고 싶은지 입력: ");
		int b=in.nextInt();
	
		int i=1;
		while (i<=b) {
			System.out.printf("%d * %d = %d\n", a, i, i*a);
			i++;
		}
		
		System.out.print("숫자를 얼마나 출력할 지 입력: ");
		int c = in.nextInt();
		int j=1;
		while (j<=c) {
			System.out.println(j);
			j++;
		}
	}
}
