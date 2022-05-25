import java.util.*;

public class Ex1 {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);

		// 주민번호 xxxxxx-1xxxxxx 입력하면
        // 성별을 출력하는 프로그램		
		System.out.println("=================================");
		System.out.println("============성별 출력============");
		System.out.println("=================================");
		
		String pid;
		int pid_ceck;
		char r;
		do {
		System.out.print("주민등록번호를 앞자리와 뒷자리를 구분하여 한줄로 입력하세요. ");
		pid=sc.nextLine();
		pid_ceck=pid.length();
		 if (pid_ceck!=14) System.out.println("잘못된 입력입니다.");
		} while (pid_ceck!=14);
		
		r=pid.charAt(7);
		
		switch (r) {
			case '1':  case '3':  case '5':  case '7':
				System.out.println("남성입니다.");
				break;
			case '2':  case '4':  case '6':  case '8':
				System.out.println("여성입니다.");
				break;
			default: 
				System.out.println("잘못된 입력입니다.");
				continue;
		}
	
	}
}