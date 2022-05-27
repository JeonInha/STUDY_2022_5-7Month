class Car {  
	// 필드 정의
	String color;	//색상
	int speed;		//현재 속도
	int gear;	
	//현재 기어
	void print() {
		System.out.printf("(%s, %d, %d)\n", color, speed, gear);
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.color="red";
		myCar.speed=0;
		myCar.gear=1;
		myCar.print();
		
		Car anotherCar=new Car();
		anotherCar.color="blue";
		anotherCar.speed=60;
		anotherCar.gear=3;
		anotherCar.print();
	}
}