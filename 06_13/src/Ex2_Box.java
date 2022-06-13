class Box {
	int x;
	int y;
	int height;
	
	public int getVolume() {
		return x*y*height;
	}

	public Box(int x, int y, int height) {
		super();
		this.x = x;
		this.y = y;
		this.height = height;
	}
	
	
}

class ColorBox extends Box {
	String color;

	public ColorBox(int x, int y, int height, String color) {
		super(x, y, height);
		this.color=color;
	}

}

public class Ex2_Box {
	public static void main(String[] args) {
		ColorBox box=new ColorBox(2, 3, 5, "white");
		
		box.color="pink";
		System.out.println(box.x);
		System.out.println(box.y);
		System.out.println(box.height);
		System.out.println(box.color);
		System.out.println(box.getVolume());
	}
}
