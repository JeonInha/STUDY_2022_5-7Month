import java.util.StringTokenizer;

public class Main2_StringBuilder {

	public static void main(String[] args) {
		
		String longLine = "apple banana carrot donut";
		String[] a = longLine.split(" ");
		System.out.print(a[2]);

		StringTokenizer st = new StringTokenizer(longLine, " ");
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println("=========================");
		
		for (int i=1; ;i++) {
			st.nextToken();
			if(i==2) {
				System.out.println(st.nextToken());
				break;
			}
		}
	}
	
	    
}
