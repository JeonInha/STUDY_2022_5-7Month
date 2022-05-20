public class StringEquals {
	public static void main(String[] args) {
		
	String a = "Hello";
    String b = "Hello";
	String llo = "llo";

    System.out.println(a==b);

    // String은 참조형;; 참조하는 대상(인스턴스)가 같은지를
    // 확인함. 값을 비교하는 것이 아님.

    System.out.println(a==("He"+llo));
	//위의 경우 값이 같음에도 참조하는 대상이 달라 false가 나옴. a, b의 Hello와 위 식의 결합으로 만들어진 Hello는 참조대상이 다름.
	
	System.out.println(a.equals("He"+llo));
	
	//참조위치가 아닌 "값"이 같은지 확인하기 위해서는 .equals() 메소드 이용!
		
		
		
	}
}