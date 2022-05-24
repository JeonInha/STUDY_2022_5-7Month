import java.util.Scanner;

public class Ex3_login {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("~보안 프로그램~");
		
		System.out.print("비밀번호를 설정하세요: ");
		String pw=sc.next(); // 비번 설정
		System.out.println("비밀번호 설정이 완료되었습니다.");
		System.out.println("- - - - - - - - - - -");
		
		int i=0;
		while (true) {		
			System.out.print("비밀번호 입력: ");
			String input=sc.next();
			if (!input.equals(pw)) {			
				i++;
				if (i<3) {
				System.out.printf("%d번 틀렸습니다. \n3번 틀리면 보안업체로 연결됩니다.", i);
				continue;
				} else {
					System.out.println("!SECURITY CALL!");
					return;
				}	
			}
			break;
		}
			System.out.println("LOGIN SUCCESS");
			
	}
}
