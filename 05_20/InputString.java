import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		System.out.println("한 줄을 입력하세요");
		String line=scan.nextLine();
		scan.nextLine();
		
		System.out.println(line);
		
		// 문자열을 입력받을 때의 주의점:: 문자열을 입력받기 이전에 정수같은 것을 입력하면 문제가 생김.
		// 숫자가 들고왔다구없어져버렸넹
		// nextLine한번 호출하면 없어짐
		
		
	}
}