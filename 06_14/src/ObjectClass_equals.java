class Car {
	private String model;
	public Car(String model ) {
		this.model=model;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car otherCar = (Car) obj; 	//다운캐스팅
			return model.equals(otherCar.model);
		}
		else 
			return false;
	}
}

public class ObjectClass_equals {
	public static void main(String[] args) {
		String a=new String("a");
		String b="a";
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
		Car fCar=new Car("a");
		Car sCar=new Car("a");
		
		if(fCar.equals(sCar))
			System.out.println("동일 종류의 차량");
		else
			System.out.println("다른 종류의 차량");
		
		//equals 재정의
	}
}
