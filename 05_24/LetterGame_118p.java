import java.util.*;

public class LetterGame_118p {
	public static void main(String[] args) {
		
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		
		int answer, guess, tries;
		answer=random.nextInt(100);
		tries=0;
		
		do {
			System.out.print("정답을 추측해보시오: ");  // guess=answer 더라도 일단 한 번은 실행
			guess=scan.nextInt();
			tries++;
			
			if (guess>answer) System.out.println("제시한 정수가 높습니다");
			if (guess<answer) System.out.println("제시한 정수가 낮습니다");
		} while (guess!=answer);
		
		System.out.printf("축하합니다. 시도횟수=%d\n", tries);
	}
}
			
			
			
			