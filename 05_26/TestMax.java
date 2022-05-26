public class TestMax {
	public static int max(int left, int right) {
		return left>right ?left:right;
	}
	
	public static void main(String[] args) {
		
		int a, b, c, d, e;
		a=3; b=4; c=5; d=6; e=7;
		
	  System.out.println(max(e, max(d, max(c, max(a, b)))));
	}
}