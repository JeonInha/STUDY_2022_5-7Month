import java.util.ArrayList;
import java.util.List;

class Point2D {

	private int x;
	private int y;

	public Point2D(int x, int y) {
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
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point2D) {
			return (((Point2D) obj).x==this.getX()&&((Point2D) obj).getY()==this.getY());
		} else return false;
	}
	
}

public class Main5_listWithObject {
	public static void main(String[] args) {
		List<Point2D> list = new ArrayList<>();
		list.add(new Point2D(0, 0));
		list.add(new Point2D(5, 5));
		Point2D a = list.get(0);
		System.out.println(a);
		System.out.println(list.get(1));
		System.out.println(list.contains(new Point2D(0, 0)));
		System.out.println(list.indexOf(new Point2D(0, 0)));
		System.out.println(list.remove(new Point2D(5, 5)));
		
		System.out.println(list);

	}

}
