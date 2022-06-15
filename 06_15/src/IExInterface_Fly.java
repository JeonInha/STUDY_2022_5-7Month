public interface IExInterface_Fly {
	// 이름규칙 대문자로 시작. 
	// 대부분 추상적인 동작에 집중하기 때문에 _할 수 있음 같은 이름으로 표현이 됨.
	// ex: Flyable
	// 클래스와 헷갈릴 수 있으므로 앞에 I를 대문자로 붙이기도 함
	
	
	// abstract를 생략해 적을 수 있음. 어차피 Interface 안의 모든 메소드는 추상메소드이기 때문에.
	public void fly();
	
	// 구체적인 일반적 메소드는 가질 수 없음
	// public void method() {}
	
	// 인터페이스에는 필드가 존재하지 않음.
}


class Animal{}

class Bird extends Animal{}	// 동물인 새

class Eagle extends Bird implements IExInterface_Fly { 	// 나는 기능을 구현한 새인 독수리. Interface를 구현한 클래스는 추상클래스를 재정의할 의무를 가짐.

	@Override
	public void fly() {
		System.out.println("퍼덕퍼덕 쌔애앵");
	}
}

class Penguin extends Bird {} 		// 나는 기능을 구현하지 않은 새인 독수리

class FlyingFish extends Animal implements IExInterface_Fly {
	
	@Override
	public void fly() {
		System.out.println("파닥파닥 참방");
	}
}

class Plane implements IExInterface_Fly {

	@Override
	public void fly() {
		System.out.println("부우웅");
	}
	
}


