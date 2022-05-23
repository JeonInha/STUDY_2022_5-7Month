public class Ex3 {
	public static void main(String[] args) {
		
		// 300~400 사이의 정수 중 13의 배수를 찾아 몇개가 있는지 출력하기
		
		int a=0;
		for (int i=300; i<=400; i++) {
			if (i%13==0) {
				a++;
			}
		}
		System.out.println("300~400 중 13의 배수는: "+a);
		

// 0 ~ 100까지의 모든 변수의 합 구하기		
		System.out.println("\n*************");
		a=0;
		for (int i=0; i<=100; i++) {
			a=a+i;
		}
		System.out.println(a);
		
		
// 100 ~ 200 사이의 짝수의 합
		System.out.println("\n*************");
		a=0;
		for (int i=100; i<=200; i++) {
			if (i%2==0) a=a+i;
		}
		System.out.println(a);
		
	}
}
				