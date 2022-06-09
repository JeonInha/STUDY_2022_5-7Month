import java.util.*;

public class Array3 {
	
	// 길이 다른 배열 카피
	public int[] copyArr(int[] array, int newLength) {
		int[] copy=new int[array.length+newLength];
		for (int i=0; i<array.length; i++) {
			copy[i]=array[i];
		}
		return copy;
	}
	
	// 두개 정수 배열을 전달받아 결합시켜 반환하는 메소드
	//	ex) [1, 2, 3] [4, 5, 6] => [1, 2, 3, 4, 5, 6]
	public int[] combineArr(int[] arr, int[] arr2) {
		int[] ret= copyArr(arr, arr2.length);
		for (int i=arr.length; i<ret.length; i++) {
			ret[i] = arr2[i-arr.length];
		}
		return ret;
	}
	
	// 두개 정수 배열의 합을 가지는 배열을 반환하는 메소드
	//	ex) [1, 2, 3] [4, 5, 6] => [5, 7, 9]
	public int[] plusArr(int[] arr, int[] arr2) {
		int[] big = (arr.length>=arr2.length)? arr : arr2;
		int[] small = (arr.length<arr2.length)? arr : arr2;
			int[] ret=copyArr(big, 0);
			for (int i=0; i<small.length; i++) {
				ret[i] += small[i];
			}
			return ret;
		}		
	
	// Arrays.fill(int[], int) 배열의 모든 원소 데이터를 int로 채움
	public int[] fillArr(int[] arr, int a) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = a;
		}
		return arr;
	}
	// 다양한 메소드 활용을 고민해볼 것.
	// 사실 위에서 만든 다양한 메소드들은 이미 자바가 제공함 ...! 그치만 생각을 해보는게 중요하다구
	public static void main(String[] args) {
		Array3 m=new Array3();
		int[] arr= {1, 2, 3};
		int[] arr2= {10, 11, 12, 13, 14};
		int[] combineArr = m.combineArr(arr, arr2);
		int[] plusArr = m.plusArr(arr, arr2);
		System.out.println(Arrays.toString(combineArr));
		System.out.println(Arrays.toString(plusArr));
		int[] ar = new int[6];
		ar=m.fillArr(ar, 10);
		System.out.println(Arrays.toString(ar));
		
	}

}
