import java.util.*;

class DiceGame {
	int diceFace;
	int userGuess;

	private void rollDice() {
		Random random=new Random();
		diceFace=random.nextInt(6)+1;
	//	diceFace = (int) (Math.random() * 6) + 1;  <- 같은 뜻. Math.random은 0~1까지의 실수 랜덤 출력. 
	// Random 클래스는 범위 지정 가능.
	}

	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private void checkUserGuess() {
		if (diceFace == userGuess)
			System.out.println("맞았습니다.");
		else
			System.out.println("틀렸습니다");
	}

	public void startPlaying() {
		userGuess = getUserInput("예상값을 입력하시오: ");
		rollDice();
		checkUserGuess();
	}
	
}

public class DiceGameT_182p {

	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.startPlaying();
	}
}
