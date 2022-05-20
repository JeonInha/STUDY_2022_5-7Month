public class Tstring {
	public static void main(String[] args) {
		
		String str;
		str="Hello World";
		System.out.println(str);
		
		// 기본형은 첫글자가 소문자로 시작, 참조형은 첫글자가 대문자로 시작. 클래스를 불러오는 것이기 때문에.
		
		String s2="다음 문자열";
		System.out.println(s2);
		
		String concat = str + 1 + "\n" + true + s2 + 3.0;
		//모든게달라붙어버리는
		System.out.println(concat);
		//문자열 및 다른 데이터타입간의 합체가 다음과같이 가능.
		
		
		System.out.println("*********");
		String hello = "Hello";
		//스트링 클래스는 문자열에서 특정한 인덱스의 글자를 찾는 메소드가 있다. 그걸 배워보자.
		//스트링은 한글자 한글자가 char며 그들의 결합으로 이루어져 있다. 그리고 이 char들에 순서가 존재한다. 이를 인덱스라고 한다. 예를 윗구문에서 들면
		// H=0, e=1, l=2, l=3, l=4;
		//인덱스는 0부터 시작하며 음수, 값보다 큰 수를 입력하면 런타임 에러가 남.

		char h = hello.charAt(0);
		System.out.println(h);
		System.out.println(hello.charAt(1));
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		
		//인덱스의 범위 확인하기; length라는 메소드 사용;
		
		int length = hello.length();
		System.out.println(length);
		
		System.out.println("*********");
		
		//InteagerToString;
		
		String strnum=new String(12345);
		String strnum=String.valueOf(12345);
		//static 메소드. 클래스 이름으로 사용하고 있는 ㅜ엡
		System.out.println(strNum);
		
		String strNum2 = ""+12345;
		//꼼수로 int를 문자열로 저장.
		
		
		//메소드의 괄호: ㄹ어ㅏㄴㅁ러안ㅁ러ㅏ니러미놓침
		
		
		
		
		
		
		
		
	}
}