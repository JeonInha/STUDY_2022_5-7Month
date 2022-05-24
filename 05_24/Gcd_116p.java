import java.util.*;

public class Gcd_116p {
	public static void main(String[] args) {
		int x, y, r; // 같은 타입의 변수가 여러 개 필요할 때 쉼표로 구분지어서 둠
		System.out.print("두 개의 정수를 입력하시오(큰 수, 작은 수): ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		
		while(y!=0) {  // 유클리드 호제법
			r=x%y;
			x=y;
			y=r;
		}
		
		System.out.printf("최대공약수는 %d입니다.\n", x);
	}
}