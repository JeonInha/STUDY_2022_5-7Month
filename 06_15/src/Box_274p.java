public class Box_274p implements Comparable {
	private double volume = 0;
	
	public Box_274p(double volume) {
		this.volume = volume;
	}

	@Override
	public int compareTo(Object o) {
		Box_274p other= (Box_274p) o;
		if(this.volume<other.volume) return -1;
		else if (this.volume>other.volume) return 1;
		else return 0;
	}
	
	public static void main(String[] args) {
		Box_274p b1=new Box_274p(100);
		Box_274p b2=new Box_274p(85.0);
		if (b1.compareTo(b2)>0)
			System.out.println("b1이 더 큼");
		else 
			System.out.println("b1이 더 작거나 같음");
	}

	
}
