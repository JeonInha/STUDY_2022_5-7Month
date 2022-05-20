public class StringMethods {
	public static void main(String[] args) {
		
		String hello = "hello";
		
		int index = hello.indexOf("o");
		//인덱스를 정수형태로 알려주는 메소드
		System.out.println(index);
		
		int notFound = hello.indexOf("a");
		System.out.println(notFound);
		//없으면 -1
		
		int a = hello.indexOf("l");
		System.out.println(a);
		//붙어있는 글자들을 찾을수도 있음.
		
		int b = hello.indexOf("l", 3);
		System.out.println(a);
		//시작점을 지정할수도 있음.
		
		int last = hello.lastIndexOf("l");
		System.out.println(last);
		//인덱스를 오른쪽에서부터 세어 찾음.
	}
}