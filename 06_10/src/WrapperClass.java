
public class WrapperClass {
	public static void main(String[] args) {
		int number=22;
		//Wrapper class 
//		Byte
//		Short
//		Integer
//		Long
//		Float
//		Double
//		Character
//		Boolean
//		
		
		
		Integer i = new Integer(10);	// 원시형 데이터 하나를 가진 참조형 객체
		Integer i2 = Integer.valueOf(500);	// boxing
		int primitiveInt=i2.intValue();		// unboxing
		
		// System.out.println(primitiveInt);
		Integer auto=100;	// auto-boxing
		int un = auto;
		
		Integer value = Integer.valueOf("5959");	// 문자열을 숫자로
		Integer.parseInt("90");
		
		int number1=10;	// 원시형 타입. 안에 메소드 없음.
		Integer refNumber=Integer.valueOf(10); // 참조형 타입. 메소드를 가짐!
		System.out.println(refNumber.doubleValue());
		
		
		System.out.print(refNumber.max(10, 20));
				
		
		
	}
}
