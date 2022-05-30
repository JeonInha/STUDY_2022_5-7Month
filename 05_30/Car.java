public class Car {
	private int speed;
	private int gear;
	private String color;
	
	public Car(String c, int s, int g) {
		
		color=c;
		speed=s;
		gear=g;
	}
	
	public Car(String c) {
		
		this(c, 0, 1);
		System.out.println("now loading . . .");
		
	}
	
	//접근(출력)
	public String a {
		return color;
	}
	
	//설정
	public void setColor(String c) {
		if (c!=null) {
		color=c;
		} 
	}
	/// private한 정보의 접근방법을 유일하게 둠. 수단이 열려있으면 경우의 수가 많아지기 때문에 제한하는 것. 이것이 객체지향의 캡슐화/추상화
	
	public int getSpeed() {
		return speed;
	}
	
	
	public void setSpeed(int s) {
		speed=s;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int g) {
		gear=g;
	}
	
	public void printAll() {
	System.out.printf("(color: %s)(speed: %d)(gear: %d)\n", color, speed, gear);
	}
	
	
}