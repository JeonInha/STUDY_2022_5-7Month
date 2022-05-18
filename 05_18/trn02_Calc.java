import java.util.Scanner;

public class trn02_Calc {
	public static void main(String args[]) {
		
		int x;
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력하세요: ");
		x = sc.nextInt();
		
		a = x*x;
		System.out.println("값: "+a);
		
	}
}