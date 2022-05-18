import java.util.Scanner;

public class trn04_time {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		int x;
		
		System.out.print("초단위를 입력하세요: ");
		x = in.nextInt();

		int s=x%60;
		int m=x%3600/60;
		int h=x/3600;
		
		System.out.println(h+"시 "+m+"분 "+s+"초");
		
	}
}
