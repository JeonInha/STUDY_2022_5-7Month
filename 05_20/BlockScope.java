
public class BlockScope {
	public static void main(String[] args) {
	
	int a = 10;
	{{	
		System.out.println("가능?");
		System.out.println(a);
		int b = 101;
	}}	
	{ int b = 30;
	}
//중괄호 짝만 맞으면 중괄호는 몇개든지 있어도 상관없음!
//이 중괄호로 만드는 범위들을 "block scope"이라고 함.
//큰 바깥범위에서 선언한 변수를 안에서 가져올 수 있다.	
//작은 안범위에서 선언한 변수는 바깥으로 가져갈 수 없다.
// => 선언한 변수는 해당 블록스코프 안에서만 사용 가능.

//이렇듯 범위가 정해져있는 변수를 '지역변수'라고 함.
//한 블록스코프 안에서 하나의 변수에 이름은 하나만 와야 함.
		
		
		//지역변수 <-> 전역변수
		
	}
}