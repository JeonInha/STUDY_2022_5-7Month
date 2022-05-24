import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;

		do {
			System.out.println("10을 나눌 수를 입력"); // 일단 한 번은 실행
			num=sc.nextInt();
			if (num==0) {
				System.out.println("0으로 나눌 수는 없음");
			}
		} while (num==0);
		
		System.out.println(10/num);
		
	}
}