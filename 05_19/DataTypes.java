public class DataTypes {
	public static void main(String[] args) {
		
		System.out.println("******정수형******");
		byte b = 100;
		short s = 30000;
		int i = 10_000_000;
		// 자릿수를 표현할 때 일상적으로 쓰는 쉼표 대신 밑줄 사용하여 표현
		// 정수를 표현할 땐 보통 넉넉하게 큰 값인 int를 사용. 더 큰 값이 필요할 땐 long을 사용하기도 함.
		
		long l = 123456789L;
		// 무지 큰 수를 표현할 수 있음. L은 컴파일러에게 이 숫자가 long 타입의 큰 숫자라는 것을 알리기 위해 붙임. 이것이 없으면 컴퓨터는 숫자를 "이건 Int값이네?" 라고 생각함.
		
		int bs = b+s;
		System.out.println(bs);
		//정수형끼리는 데이터형이 달라도 연산할 수 있음. 다만, 정수끼리의 연산에서 데이터형은 더 큰 데이터형을 따라감.
		//큰 범위의 정수형은 작은 범위의 정수형을 표현할 수 있음.
		
		
		System.out.println("******실수형******");
		float f = 123.456f;
		// 컴파일러는 실수표현을 보면 기본적으로 double형이라 생각,
		// 이것이 float형이라 알려주는 것이 f.
	    double d = 7777.88888;
		
		double sum = f+d;
		float sum2 = i + f;
		// 실수형끼리도 연산 가능. 더 큰 데이터형을 따라감.
		// 정수형과 실수형 끼리의 연산에서는 데이터형이 실수형을 따라감.(실수가 정수보다 표현범위가 더 큼.)
		
		float one = 0.1f;
		System.out.printf("%.15f", one*22);
		System.out.println();
		// float은 오차가 있음.
		// 소숫점 아래 몇자리까지 표현할 수 있을지 지정할 수 있음.
		
		
		System.out.println("******문자형******");
				
		char a = 'a';
		char c = 'c';
		char ga = '가';
		char num1 = '1';
		
		char what = 65;
		//문자형을 숫자로도 표현 가능
		System.out.println(what);
		System.out.println(what+a);
		//char형 변수끼리 연산을 하면 결합하는게 아닌, 산술을 함.
		// 문자형은 홑따옴표를 사용. char은 문자'하나'를 표현범위가
		System.out.println(a);
		System.out.println(c);
		System.out.println(ga);
		System.out.println(num1);
		
		System.out.println("******논리형******");
		
		/* 
		boolean t = true;
		boolean f = false;
		System.out.println(t);
		System.out.println(f);
		
		*/
		
		// 산술연산이 불가능.
		// boolean타입은 값으로 true, false 딱 둘만을 가질 수 있음.
		// java에서는 1과 0으로 표현 불가능(가능한 언어들도 있지만 자바는 아님)
					
	}
}
