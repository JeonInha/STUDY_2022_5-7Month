// 0~9 무작위 수를 정하여 사용자가 해당하는 수의 배수를 순서대로 입력하 하여 틀릴 경우 종료

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int input, count, rnum, i;
		count=0;
		i=0;
		
		//랜덤변수 추출기
		rnum=r.nextInt(9);
		while (rnum==0||rnum==1) rnum=r.nextInt(9);
		
		//프로그램 시작
		System.out.printf("%d의 배수를 순서대로 입력하시오\n",rnum);
		
		/*
		while (true) {
			System.out.print("배수 입력: ");
			input=sc.nextInt();	
			i++;
			if (input!=i*rnum) {
				System.out.println("오답");
				break;
				}
				System.out.println("Right!");
				count++;				
			}
		} */
		
		do {
			System.out.print("배수 입력: ");
			input=sc.nextInt();
			i++;
			if(input!=i*rnum) {
				System.out.println("!WRONG!");
				break;
			}
			System.out.println("정답");
			count++;
		}
		while (input%rnum==0);

		System.out.println("****************");
		System.out.printf("정답 갯수: "+count);
	}
}
		