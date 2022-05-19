public class IncDec {
	public static void main(String[] args) {

		        System.out.println("**연산자, 대입연산자**");	
//*********** 연산자, 대입연산자 ************
		int a = 55;
		
		a = 78;
		
		a = a+5;
		
		System.out.println(a);
		
		// 대입연산을 줄여서 표현하는 방법: 복합대입연산자
		a += 5; // => a = a+5; 같은 뜻
		//복합대입연산자는 대입연산자 앞에 산술연산자를 쓰는것으로 진행됨.
		
		a = 10;
		a += 2; // 12
		a -= 2; // 10
		// 복합대인연산자로 가장 많이 하는 연산.
		

        System.out.println("**증감 연산자**");		
// ************ 증감 연산자 *******************
		
		
		//증감연산자
		a++; //a에다 1을 더하기 // 11
		a++; // 12
		a++;  //13
		a--; //a에다 1을 빼기 //12
		
		System.out.println(a);
		
		
		//증감연산자를 쓸 때의 유의점
		System.out.println(a++); //12.  증가한 값 안보임
		System.out.println(a);  //13. 증가한 값이 여기에 보임
		System.out.println(++a);  // 14
		// 증감연산자가 변수의 앞,뒤 중 어디에 오느냐에 따라 값 사용과 변수의 증감 순서가 달라짐.
		// a++ :: a값을 먼저 사용한 후 1을 증가시킴
		// ++a :: 1 증가한 후 a 값 사용.
		
		
		 System.out.println("**관계 연산자**");
// ************* 관계 연산자 **************

// 두 값을 비교하여 어떠한지 묻는 연산자.

        System.out.println(55 == 55); //x와 y가 같은가?
		System.out.println(55 != 55); //x와 y가 다른가?
		System.out.println(55 >  55); //x가 y보다 큰가?
		System.out.println(55 <  55); //x가 y보다 작은가?
		System.out.println(55 >= 55); //x가 y보다 크거나 같은가?
		System.out.println(55 <= 55); //x가 y보다 작거나 같은가?
		
		int num = 33;
//		System.out.println(0 <= num <= 100);
		
//      윗줄은 오류. 명령에서 관계연산자는 순차적으로 처리되는데, 첫 연산 (0<=num)에서 도출된 값이 boolean 자료형이기 때문에 숫자 100과 비교하지 못해서 컴파일에러가 남.
		
//		두 관계연산을 동시에 할 때는 논리 연산자를 사용.
		
		System.out.println("**논리 연산자**");
		
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);

	}
}