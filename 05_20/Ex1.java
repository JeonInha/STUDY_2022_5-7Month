// 사용자의 나이와 이름을 입력받아서 자기와 같으면 true 출력하는 프로그램

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String id, uId;
		int age, uAge;
		id = "전인하";
		age = 25;
		
		System.out.print("이름이 무엇입니까: ");
	    uId=sc.nextLine();
		System.out.print("나이가 무엇입니까: ");
        uAge=sc.nextInt();
		System.out.println(age==uAge&&id.equals(uId));
		
		
		
	}
}