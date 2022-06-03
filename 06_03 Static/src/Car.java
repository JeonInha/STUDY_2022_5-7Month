
public class Car {
	private String color;
	private int speed;
	private int gear;
	private int id;
	
	
	public static final int SHARE_NUMBER=22;
	// 변하지 않는 같은 값을 공유할 때-상수- 활용하기 좋은 static
	private static int numberOfCars=0;
	
	
	public Car(String string, int i, int j) {
		color=string;
		speed=i;
		gear=j;
		id=++numberOfCars;
	}
	
/*		public static void printColor() {
			System.out.println(color);
		}
		
		메소드를 호출하는 시점에서 변수 color가 만들어졌는지 아닌지 알 수 없음. 그래서 오류.
		static 한 메소드 안에서는 필드값을 가지는 것이 안됨.
		
		static = 퍼블릭으로 사용하지 않음. 어디에서나 쓸 수 있는 정적메소드라 퍼블릭하면 어디서 바꾸었는지 알수가 없기 때문.
*/
		
		public void printStaticNumber() {
			System.out.println(numberOfCars);
		}
	
		public static int getNumberOfCars() {
			return numberOfCars;
		}
	}
