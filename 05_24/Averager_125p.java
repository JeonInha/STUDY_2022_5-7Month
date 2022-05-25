import java.util.*;

public class Averager_125p {
	public static void main(String[] args) {
		int total=0;
		int count=0;
		Scanner scan=new Scanner(System.in);
		while (true) {
			System.out.print("점수를 입력하시오: ");
			int grade=scan.nextInt();
			if (grade<0) // 음수 정수를 입력하면 잘못된 입력이라 
				break;   // 루프가 종료되게 코드를 짰음.
			
			total+=grade;
			count++;
		}
		System.out.println("평균은 "+total/count);
	}
}



