class Point {
	private int x, y;
	
	public Point(int a, int b) {
		x=a;
		y=b;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

class Circle {
	private int radius=0;
	private Point center; // has - a 관계. 클래스를 필드로 가지는 클래스. 클래스 간의 관계가 필드로 연결되어 있음.
	
	//생성자
	public Circle(Point p, int r) {
		center=p;
		radius=r;
	}
	
	// 중심점을 get으로 알려주는 메소드
	public Point getPoint() {
	return center;
	}
	
	public void setPoint(Point p) {
		this.center=p;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Point p=new Point(25, 78);
		Circle c=new Circle(p, 10);
	}
}
