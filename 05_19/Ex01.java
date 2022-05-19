import java.util.Scanner;

public class Ex01 {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		int a;
		
		System.out.print("정수를 입력하세요: ");
		a = in.nextInt();
		
		System.out.printf("%d %d %d %d %d", a-=2, a+=1, ++a, ++a, ++a);
		
	}
}
	