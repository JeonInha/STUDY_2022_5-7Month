abstract class Shape {
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("(x=%d, y=%d)", x, y);
	}
	
	
	//추상메소드
	// 동작에 대한 구체적인 것이 없음: Body X
	public abstract double getArea();
}

class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	
	@Override 	// 재정의 / 구현한다.
	public double getArea() {
		return base*height/2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}

class Rectangle extends Shape {
	
	private int length;
	private int height;
	
	public Rectangle(int x, int y, int length, int height) {
		super(x, y);
		this.length = length;
		this.height = height;
	}
	
	@Override 	// 재정의 / 구현한다.
	public double getArea() {
		return length*height;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}

class Circle extends Shape {
	private int r;

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return (double)r*r*Math.PI;
	}
}

// 삼각형
// 중심점, 밑변, 높이
// 직사각형
// 중심점, 중심점, 가로, 세로
// 원
// 중심점, 반지름, 

//넓이 구하는 메소드


public class Main_Shape {
	public static void main(String[] args) {
		Triangle a=new Triangle(0, 0, 3, 4);
		System.out.println(a.getArea());
		
		Shape s=a;  // 자동 업캐스팅?
		System.out.println(s.getArea());
		
		Circle b=new Circle(0, 0, 3);
		System.out.println(b.getArea());
	}
}
