public class Ex2 {
	public static void main(String[] args) {
		
		for (int i=1; i<5; i++) {
			for (int j=1; j<5; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println("");
		}
	
		System.out.println("\n\n");
		
		for (int i=1; i<=5; i++) {
			if (i%2!=0) {
				for (int j=1; j<=5; j++) {
					System.out.printf("(%d) ", j);
				}
			} else {
				for (int j=5; j>=1; j--) {
					System.out.printf("(%d) ", j);
				}
			}
			System.out.println();
		}



	}
}