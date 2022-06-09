public class Ex1 {
	// 배열 중 10~99 사이의 수만 출력, 그 갯수도 출력
	public void method() {
		
	}
	public static void main(String[] args) {
		int[] arr = {15, 32, 222, 119, 534, 9, 1234, 36};
		int count=0;
		for(int i=0; i<arr.length; i++) {	// count 변수를 사용하여 배열 중 특정 갯수 세기	
			if (arr[i]>9&&arr[i]<100) {
				count++;
			}
		}
		System.out.println("갯수: "+count);	// 갯수 출력
		System.out.println("---목록---");
		for(int i=0; i<arr.length; i++) {	// 반복문 이용해 배열 중 조건에 맞는 데이터만 출력
			if (arr[i]>9&&arr[i]<100) {
				System.out.println(arr[i]);
			}
		}
	}
}
