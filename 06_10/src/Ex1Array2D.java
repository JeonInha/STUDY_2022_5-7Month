public class Ex1Array2D {
	public static void main(String[] args) {
		// 2~5의 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		// 2 4 8 16 ..
		// 3 9 27 81 ...
		// 4 ..
		// 5 ...
		
		int[][] arr=new int[4][5];
		
		for (int i=0; i<arr.length; i++) {
			int num=i+2;
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=num;
				num*=i+2;
				// = arr[i][j]=(int) Math.pow(i+2, j+1);
				System.out.printf("%d, ",arr[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
