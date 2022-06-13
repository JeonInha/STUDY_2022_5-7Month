class Animals {
	public void sound() {
		System.out.println("동물은 제각각 소리를 냅니다.");
	}
}

// 메소드 오버라이드: 부모 클래스의 헤더를 그대로 복사: 자식클래스의 바디에서 구체화


class Dogs extends Animals {
	
	@Override		// 이걸로 오버라이드 한게 맞는지 확인하기! // annotation
	public void sound() {
		System.out.println("υ´• ﻌ •`υ 앍왉 와르릉 컁");
	}
}
	
class Cats extends Animals {
	
	@Override
	public void sound() {
		System.out.println("=^._.^= ∫  먉 애옭 그르릉");
	}
}


public class Inherit_Method {
	public static void main(String[] args) {
		Animals a=new Animals();
		Dogs b=new Dogs();
		Cats c=new Cats();
		
		a.sound();
		b.sound();
		c.sound();
		
		//동일한 이름의 메소드가 있을 때 부모의 것이 아닌 자식의 메소드가 호출
		
	}
}
