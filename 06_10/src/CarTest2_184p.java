class Car {
	private int speed;
	public void setSpeed(int s) {
		speed=s;
		System.out.println("정수 버전 호출");
	}
	
	public void setSpeed(double s) {
		speed=(int)s;
		System.out.println("실수 버전 호출");
	}
	
}

public class CarTest2_184p {
	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.setSpeed(100);
		myCar.setSpeed(79.2);
		myCar.setSpeed(432423L);
		myCar.setSpeed('a');

	}

}
