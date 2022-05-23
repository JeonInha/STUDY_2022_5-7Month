public class Ex1 {
	public static void main(String[] args) {

// 번갈아 반짝이는 흰별 까만별 출력		
	int i=0;
	while (i<8) {
//		String a=;
//		System.out.println(a);
        System.out.println((i%2==0)?"☆":"★");
		i++;
	}

// 0부터 100 사이의 수 중 3의 배수 또는 7의 배수 출력
   int j=0;
   while (j<=100) {
	   if (j%3==0||j%7==0) System.out.println(j);
	   j++;
    }

//0부터 100 사이의 수 중 일의 자리 수가 3, 6, 9 일때만 출력	
	int k=0;
	while (k<=100) {
		if (k%10==3||k%10==6||k%10==9) {
			System.out.println(k);
		}
		k++;
	}
	
	
	}
}