abstract class MyClass {
	public abstract void myMethod();
	public abstract void myMethod3();
	
}

abstract class MySubClass extends MyClass {
	@Override 
	public void myMethod() { 	
	System.out.println("자식 클래스에서 구현되었습니다.");
	}
	
	@Override 
	final public void myMethod3() {
		System.out.println("final method.");
	}
	
	public abstract void myMethod2();
}

final class MyImpleClass extends MySubClass { 	// 종단클래스. 더이상 확장 불가

	@Override
	public void myMethod() {		// 덮어씌워짐
		System.out.println("새롭게 재정의");
	}
	
	// myMethod()는 MyImpleClass의 상위클래스에서 구현되어서 구현할 의무가 없음
	@Override
	public void myMethod2() {
		System.out.println("마이메소드2 오버라이드 구현");
	}
	
//	@Override 
//	final public void myMethod3() {}	// final 클래스라 재정의 못함. 컴파일에러
}

public class Main_MyClassAbstract {
	public static void main(String[] args) {
		MyClass a=new MyImpleClass();
		a.myMethod();
		
		MySubClass sub=(MySubClass) a;
		sub.myMethod2();
		sub.myMethod();
	}
}
