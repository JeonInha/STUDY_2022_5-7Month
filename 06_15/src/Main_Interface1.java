public class Main_Interface1 {
	public static void main(String[] args) {
	//	IExInterface_Fly f=new IExInterface_Fly(); 인스턴스는 인터페이스화 불가
		
		Eagle e=new Eagle();
		Bird b=e;
		Animal a=e;
		IExInterface_Fly f=e;	// 메소드 호출 가능
		
		Plane p=new Plane();
		IExInterface_Fly fish=new  FlyingFish();
		
		e.fly();
		f.fly();
		p.fly();
		fish.fly();
		
		Eagle downCasting=(Eagle) f;
		downCasting.fly();
		
		// 에러. 물고기는 독수리로 다운캐스팅 안됨.
		Eagle test= (Eagle) fish;
		test.fly();
		
	}
}
