import java.util.Scanner;

public class TestMethod4 {
	
	public static int increase (int a) {
		a++;
		return a;
	}
	
	public static String check(int a) {
		if (a%2==0) return"짝수";
		else return"홀수";		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=10;
		a=increase(a);
		System.out.println(a);  // 10 출력
		System.out.println("=========");
		int b=sc.nextInt();

		System.out.println(check(b));
	}	
}