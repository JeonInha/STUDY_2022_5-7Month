public class Cast {
	public static void main(String[] args) {
		
		byte b = 10;
		short s = 100;
		
//		byte, short은 명시적인 표현이 없는 이상 int로 인식하려고 함. 강제적인 형변환이 일어남.
		int i = 1000;
		long l = 10000;
		
		int sum = b+s;
		//자료형의 확장.일반적으로 자동적으로 이루어짐.
		System.out.println(sum);
		
		//자료형의 축소. 손실이 일어날 가능성이 있음. 일례로, double을 int 안에 넣는 것. 그렇게 하면 소숫점 부분이 날라간다. 실수부분으 ㄹ
		
		// 형변환의 방법: 데이터 앞에 변환하고 싶은 자료형을 괄호안에 붙여 넣기. 
		
	  // ex) int i=(int)100000L;
	  
	  int a = (int)2135456566325325L;
	  int x = (int)243.2435324;
	  System.out.println(a);
	  System.out.println(x);
	  
	  
	  char y = (char)65;
	  int num = int a;
	  System.out.println(num);
	  //char과 int 사이의 형변환.
	  
	}
}