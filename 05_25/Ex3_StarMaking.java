import java.util.Scanner;

public class Ex3_StarMaking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("======별 찍기 1=======");
		System.out.print("원하는 줄 수를 입력: ");
		int x=sc.nextInt();
		for (int i=1; i<=x; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		///////////////////////////////
		System.out.println("\n\n======별 찍기 2=======");
		System.out.print("원하는 줄 수를 입력: ");
		x=sc.nextInt();
		for (int i=1; i<=x; i++) {
			for(int j=x; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		//////////////////////////////
		System.out.println("\n\n======별 찍기 3=======");
		System.out.print("원하는 줄 수를 입력: ");
		x=sc.nextInt();
		for (int i=1; i<=x; i++) {
			for(int j=x; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		
		System.out.println("\n\n======별 찍기 4=======");
		System.out.print("원하는 줄 수를 입력: ");
		x=sc.nextInt();
		for (int i=1; i<=x; i++) {
			for(int j=x; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		System.out.println("\n\n======별 찍기 5=======");
		System.out.print("원하는 줄 수를 입력: ");
		x=sc.nextInt();
		for (int i=1; i<=x; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=x*2-1; j>=i*2-1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}




	}
}