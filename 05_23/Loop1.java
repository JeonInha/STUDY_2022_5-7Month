public class Loop1 {
	public static void main(String[] args) {

// Hello world 10번 출력	
		int i = 0;	
		while (i<10) {
			System.out.println("Hello World");
			i++;
		}

// 1부터 10까지 출력
		int j = 1;			
        while (j<11) {
            System.out.print(j);
            j++;
		}

// 10부터 0까지 출력
		int k = 10;		
		while (k>=0) {
			System.out.println(k);
			k--;
		}
// 100보다 작은 3의 배수 출력
        int l = 0;
		while (l<100) {
			System.out.println(l);
			l+=3;
		}
		
		
		
	}
}