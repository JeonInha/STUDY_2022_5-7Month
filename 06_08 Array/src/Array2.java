public class Array2 {
	
	// 정수형 배열을 전달받아 같은 길이와 원소값을 가지는 정수 배열을 반환하는 메소드
	// Arrays.copyOf(int[], int length)
	public int[] copyArray(int[] array) {
		int[] copy=new int[array.length];
		for (int i=0; i<array.length; i++) {
			copy[i]=array[i];
		}
		return copy;
	}
	
	// 정수형 배열 2개가 동일한지(길이와 각 원소값)를 알 수 있는 메소드
	// Arrays.equals(int[], int[]);
	public boolean checkEqualArr(int[] array, int[] array2) {
		if (array.length!=array2.length) return false;
		for (int i=0; i<array.length; i++) {
			if (array[i]!=array2[i]) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Array2 me=new Array2();
		int[] arr = {10, 20, 30, 40, 50};
		int[] copy = me.copyArray(arr);
		System.out.println(me.checkEqualArr(arr, copy));
		
		// 참조형이기 때문에 참조 박스 안의 데이터값을 변경하면,
		// 그 참조 박스를 참조하고 있는 다른 변수의 값도 같이 변해버림.
	}

}
