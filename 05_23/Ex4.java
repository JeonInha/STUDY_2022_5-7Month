import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("***범위 수 합산 프로그램***");
		int i, x, sum;
		System.out.print("시작 수 입력: ");
		i=sc.nextInt();
		System.out.print("끝 수 입력: ");
		x=sc.nextInt();
		sum=0;
		
		for(; i<=x; i++) {
			sum+=i;
		}
		
		System.out.println("합: "+sum);
		
	   System.out.println("\n***사용자가 입력한 5개 정수의 합 구하기***");
	   sum=0;
	   x=0;
		for(i=1; i<=5; i++) {
			System.out.printf("정수 입력 %d: ", i);
			x=sc.nextInt();
			sum=sum+x;
		}
		System.out.println("합: "+sum);
		
		
	   System.out.println("\n***사용자가 입력한 갯수의 정수의 합 구하기***");
	   double sum1=0;
	   double sum2=0;
	   int count1=0;
	   int count2=0;
	   System.out.printf("정수 갯수 입력: ");
	   x=sc.nextInt();
	   int y;
		for(i=1; i<=x; i++) {
			System.out.printf("정수 입력 %d: ", i);
			y=sc.nextInt();
			if(y%2==0) {	
			sum1=sum1+y;
			count1++;
			} else {
				sum2=sum2+y;
				count2++;
			}
		}
		System.out.println("합: "+sum1+sum2);
		System.out.println("평균: "+(sum1+sum2)/x);
		System.out.println("홀수 합: "+sum2);
		System.out.println("홀수 평균: "+sum2/count2);
		System.out.println("짝수 합: "+sum1);
		System.out.println("짝수 평균: "+sum1/count1);
		
	}
}
			
		
		