import java.util.Scanner;

public class ExMethod2 {
	
	public static String compare(int a, int b) {
		if (a>b) {
			return a+"가 큼";
		} else if (a<b) {
			return b+"가 큼";
		} else {
			return "값이 같음";
		}
	}
	// 정수를 출력받아 왼쪽이 큰지, 오른쪽이 큰지, 혹은 같은지를 알고싶음
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 입력 ");
		int a=sc.nextInt();
		System.out.print("정수 입력 ");
		int b=sc.nextInt();
		
		System.out.println(compare(a, b));
		
	}
}