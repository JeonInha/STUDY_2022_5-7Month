class Car {
	public int speed;
	public int gear;
	public String color;
	
	public Car() {
		speed = 0;
		gear = 1;
		color = "red";
	}
	public void speedUp() {
		speed+=10;
	}
	
	public String toString() {	// 객체의 상태를 문자열로 반환: 자동적으로 되는 메소드(?)
		String result = String.format("속도: %d, 기어: %d, 색상: %s", speed, gear, color);
		return result;
	}
}


public class CarArrayTest_231p {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
		Car[] car2 = new Car[NUM_CARS];
		
//		for (Car c: cars) {	// for each는 입력에 못씀!!!!!!!!!
//			c=new Car();
//		}
		
		for (int i=0; i<cars.length; i++) 
			car2[i] = new Car();
		
		for (Car c: car2) {
			c.color="blue";
			System.out.println(c);
		}
		
		
		for (int i=0; i<cars.length; i++) 
			cars[i] = new Car();
		for (int i=0; i<cars.length; i++)  
			cars[i].speedUp();
		for (int i=0; i<cars.length; i++) 
			System.out.println(cars[i]);	// 이름이 toString()이고 리턴형이 String인 메소드로 만들어두면, 객체를 문자열 형태로 다루려고 할 때 자동적으로 그 메소드가 호출이 됨. 

	}

}
