import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
       // 2의 제곱 수 32개 나열하고 결과값 확인하기
		System.out.println("***2의 제곱수 32개 나열***");

		for (int i=1; i<=32; i++) {
					long sq=1L;
			for (int j=1; j<=i; j++) {
				sq*=2;
			}
			System.out.println(i+"="+sq);
		}
		System.out.println("\n\n\n");
		
		
		//사용자 입력 n, m에 대해 n^m 출력하기
		System.out.println("***입력받아 n^m 출력***");
		System.out.print("밑 입력: ");
		int n=sc.nextInt();
		System.out.print("지수 입력: ");
		int m=sc.nextInt();
		Long sum=(long)n;
		for(int i=1; i<m; i++) {
			sum*=n;
		}
        System.out.println("값: "+sum);
						
		System.out.println("\n\n\n");
		
		
	}
}
		