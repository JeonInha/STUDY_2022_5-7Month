import java.util.*;

public class DaysInMonth_p111 {
	public static void main(String[] args) {
		int month;
		int year=2022;
		int days=0;
		
		System.out.print("일수를 알고 싶은 달을 입력하시오: ");
		Scanner sc=new Scanner(System.in);
		month=sc.nextInt();
		
		switch (month) {
			case 1:  case 3:  case 5:  case 7:  case 8:  case 10:  case 12:
				days=31;
				break;
			case 4:  case 6:  case 9:  case 11:
				days=30;
				break;
			case 2:
				if ((year%4==0)&&(year%100!=0)||(year%400==0)) days=29;
				else days=28;
		}
		System.out.println("월의 날수는 "+days);
		
	}
}
		