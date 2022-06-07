import java.util.*;

public class Array4 {
	
	static void printArray(char[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	static String printArrayString(char[] array) {
		
		String a = "";
		for (int i=0; i<array.length; i++) {
			a+=array[i];
		}
		return a;
	}
	
	//캐릭터 배열에서 하나의 특정 문자를 찾아 반환하는 메소드
	// indexOf
	public static int whereis(char[] target, char c) {
		int print=-1;
	for (int i=0; i<target.length; i++) {
		if (target[i]=='c') {
			print= i;
		}
	}
	return print;
	}
	

	public static void main(String[] args) {
		char[] hello = {'h', 'e', 'l', 'l', 'o'};
		printArray(hello);
		System.out.println();
		System.out.println(printArrayString(hello));
		System.out.println(Arrays.toString(hello));	// 문자열 전부를 String으로 반환하는 java.util.Array클래스의 스태틱 메소드
		
		

		// 위의 문자 배열의 o의 문자에 해당하는 인덱스를 찾아보세요~!
		for (int i=0; i<hello.length; i++) {
			if (hello[i]=='o') System.out.print("\n\'o\'의 인덱스는 "+i);
		}
	}
}