public class TestCar {

	public static void main(String[] args) {
		Car car=new Car("yellow");
		car.setColor("red");
		System.out.println(car.getColor());
	
		
		
		Car car2=new Car("white");
		car2.printAll();
		
		Car car3=new Car("green", 10, 3);
		car3.printAll();

		
	}
}