public class Ex1 {
	
	public void method() {
		
	}
	public static void main(String[] args) {
		int[] arr = {15, 32, 222, 119, 534, 9, 1234, 36};
		int count=0;
		for(int i=0; i<arr.length; i++) {			
			if (arr[i]>9&&arr[i]<100) {
				count++;
			}
		}
		System.out.println("갯수: "+count);
		System.out.println("---목록---");
		for(int i=0; i<arr.length; i++) {			
			if (arr[i]>9&&arr[i]<100) {
				System.out.println(arr[i]);
			}
		}
	}
}
