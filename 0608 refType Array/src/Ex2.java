import java.util.Scanner;

public class Ex2 {
	
	Scanner sc=new Scanner(System.in);
	int input;
	
	private int inputNum() {
		int number=0;
		do {
			number=sc.nextInt();
		} while (number>100||number<1);
		return number;
	}
	
	public void printHistogram(int[] a, int min, int max) {
		System.out.printf("%d-%d: ", min, max);
		for (int i=0; i<10; i++) {
			if (a[i]>=min&&a[i]<=max)
				System.out.print("*");
		}
		System.out.println();
	}
		
	public void histogram() {
		int[] histogram = new int[10];
		for (int i=0; i<10; i++) {
			System.out.printf("%d번째 정수 입력: ", i+1);
			histogram[i]=inputNum();
		}
		System.out.println("-----------------------");
		for (int i=1; i<=10; i++) {		// 출력
			printHistogram(histogram, 1+(i-1)*10, i*10);
		}
	}
	
	public static void main(String[] args) {
		Ex2 ex=new Ex2();
		ex.histogram();
	}
}
