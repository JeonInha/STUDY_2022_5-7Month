import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] aBox = new int[5];
		System.out.println("사용자에게 5번의 정수를 입력받아 최근 입력한 순 (역순)으로 출력하기");
		for (int i=0; i<5; i++) {
			System.out.print((i+1)+"번째 정수 입력: ");
			aBox[i]=sc.nextInt();
		}
		
		System.out.println("출력합니다");
		for(int i=4; i>=0; i--) {
			System.out.printf("%d ", aBox[i]);
		}
		
		System.out.println("\n====================================================");
		System.out.println("0 이하 정수를 입력할 때 까지 반복해서 입력하고, 최근 5개를 출력");
		
		
		int[] cBox=new int[j];
		int j=1;
		for (int i=0; ;i++) {
			System.out.print("정수 입력: ");
			int input=sc.nextInt();
			if (input<=0) break;
				cBox[i]=input;
				j++;
			}
		System.out.println("출력합니다");
		for(int i=cBox.length-1; i>cBox.length-6; i--) {
			System.out.printf("%d ", cBox[i]);
		}
		
		
		System.out.println("\n====================================================");
		System.out.println("0 이하 정수를 입력할 때 까지 반복해서 입력하고, 최근 5개를 출력");
		
		int[] bBox=new int[5];
		for (int i=0; ;i++) {
			System.out.print("정수 입력: ");
			int input=sc.nextInt();
			if (input<=0) break;
			if (i<=4){
				bBox[i]=input;
			} else {				
				bBox[0]=bBox[1];
				bBox[1]=bBox[2];
				bBox[2]=bBox[3];
				bBox[3]=bBox[4];
				bBox[4]=input;
			}
		}
		
		System.out.println("출력합니다");
		for(int i=4; i>=0; i--) {
			System.out.printf("%d ", bBox[i]);
		}
	}
}
