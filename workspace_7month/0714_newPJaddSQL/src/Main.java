import kr.co.greenart.MyMath;
import kr.co.greenart.Person;

// jar 파일 inport해오기
// 의존성이란게 생겨서 어쩌구

public class Main {
	public static void main(String[] args) {
		Person p = new Person("이름", 15);
		System.out.println(p);
		System.out.println(MyMath.getZero());
		System.out.println(MyMath.sum(10, 20));
	}
	
	// sql driver를 import해와서 외부라이브러리를 사용할 것임.
}
