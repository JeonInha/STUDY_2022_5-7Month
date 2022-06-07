import java.util.Scanner;

public class ArrayTest1_225p {
	public static void main(String[] args) {
		final int STUDENTS=5;
		int total=0;
		
		Scanner sc=new Scanner(System.in);
		
		int[] scores=new int[STUDENTS];
		
		for (int i=0; i<STUDENTS; i++) {
			System.out.print("성적을 입력하시오: ");
			scores[i] = sc.nextInt();
		}
		
		for (int i=0; i<STUDENTS; i++) {
			total+=scores[i];
		}
		
		System.out.printf("평균 성적은 %f입니다.", (double)total/STUDENTS);

	}

}
