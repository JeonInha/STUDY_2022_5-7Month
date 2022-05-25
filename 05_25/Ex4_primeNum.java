//2~100 사이의 모든 소수 출력하기
public class Ex4_primeNum { 
	public static void main(String[] args) {
		
		
		for (int i=2; i<100; i++) { // 1부터 100까지 루프, 2부터 100까지 세기 (i)
			int check=0; // 소수 판별 변수 초기화
			for (int j=2; j<i; j++) { // i가 소수인지 판별하기 위해 i를 2~i-1까지 나누기
				int dv=i%j; // 나머지
				if (dv==0) check=1; // 약수가 존재하면 1, 약수가 없으면(=소수이면) 0
			}
			if (check==0) { // 판별기에 따라 소수일 때만 i 출력
				System.out.println(i);
			}
		}
		
	}
}