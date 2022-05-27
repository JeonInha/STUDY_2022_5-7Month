public class TestBox {
	public static void main(String[] args) {
		ClassBox box1; // ClassBox 클래스의 box1이라는 참조변수 생성
		
		ClassBox none=null;
//		none.width=10;  // 컴파일은 없지만 런타임 에러가 뜸. 문법에는 문제가 없으나 "없는 인스턴스"에 값을 넣으려고 해서.
		
			
		
		box1=new ClassBox(); // 인스턴스화
		
		box1.width=3;
		box1.length=3;
		box1.height=3;
		
		ClassBox box2=new ClassBox();
		box2.width=10;
		box2.length=10;
		box2.height=10;
		
		box1.printAllState();
		box2.printAllState();
		box1.getVol();
		
//		System.out.println(box1.width);
//		System.out.println(box2.width);
//		
//		box1.width=5;
//		System.out.println(box1.width);

//		System.out.println(box1.width);
//		System.out.println(box1.length);
//		System.out.println(box1.height);
// 박스는 자기 자신의 부피를 구해서 정수형 값으로 알려줄 수 있음.
		System.out.println(box1.getVol());
	}
	
	
	
	
}