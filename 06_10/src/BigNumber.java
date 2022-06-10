import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumber {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE); // 해당 자료형이 표현할 수 있는 최댓값
		
		BigInteger value1 = new BigInteger("99999999999999999999999999"); 
		// Long보다 큰 값을 문자열 형태로 다룰 수 있게 생성자 사용해서 만든 객체.
		System.out.println(value1.add(new BigInteger("100")));
		//더하고 싶을 땐 다른 BigInteger 변수를 만들어 .add() 연산자를 써야 함!
		System.out.println(value1);
		value1=value1.add(new BigInteger("100"));	// 변경하고싶으면 이렇게
		System.out.println(value1);
		
		BigDecimal dec = new BigDecimal("0.123123"); // 기이이이인 실수형
		System.out.println(dec);
		BigDecimal d=new BigDecimal(0.1);
		System.out.println(d);

	}

}
