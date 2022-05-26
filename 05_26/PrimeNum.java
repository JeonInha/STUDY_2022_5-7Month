public class PrimeNum {
	public static boolean getPnum(int x) { // 소수인지 확인해서 여부를 boolean값으로 출력하는 메소드
		int count=0;
		for (int i=1; i<=x; i++) {
			if (x%i==0) count++;
		}
		if (count==2) return true;
		else return false;
	}
	
	public static void main(String[] args) {

		for (int i=2; i<=10000; i++) {
			if (getPnum(i)) System.out.println(i);
			}
		}
		
}