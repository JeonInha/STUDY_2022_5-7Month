import java.util.Scanner;

public class ExMethod1 {
	
	public static int check() {
		Scanner sc=new Scanner(System.in);
		int num;
		
		do {
		num=sc.nextInt();
			if (0>num||num>=100) {
			System.out.print("잘못된 입력입니다.\n다시 입력: ");
			}
		} while (0>num||num>=100);
		return num;
	}
	
	public static void main(String[] args) {
		System.out.print("국어 :");
		int ko=check();
		System.out.print("영어 :");
		int eg=check();
		System.out.print("수학 :");
		int mt=check();
		
		System.out.printf("국어 점수: %d\n", ko);
		System.out.printf("영어 점수: %d\n", eg);
		System.out.printf("수학 점수: %d\n", mt);
		System.out.println("점수 합: "+(ko+eg+mt));

		
	}
}