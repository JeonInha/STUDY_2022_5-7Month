import java.util.*;

public class Ex1_MorseCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, String> map = new HashMap<>();

		map.put('A', "ㆍ－");
		map.put('B', "－ㆍㆍㆍ");
		map.put('C', "－ㆍ－ㆍ");
		map.put('D', "－ㆍㆍ");
		map.put('E', "ㆍ");
		map.put('F', "ㆍㆍ－ㆍ");
		map.put('G', "－－ㆍ");
		map.put('H', "ㆍㆍㆍㆍ");
		map.put('I', "ㆍㆍ");
		map.put('J', "ㆍ－－－");
		map.put('K', "－ㆍ－");
		map.put('L', "ㆍ－ㆍㆍ");
		map.put('M', "－－");
		map.put('N', "－ㆍ");
		map.put('O', "－－－");
		map.put('P', "ㆍ－－ㆍ");
		map.put('Q', "－－ㆍ－ ");
		map.put('R', "ㆍ－ㆍ ");
		map.put('S', "ㆍㆍㆍ");
		map.put('T', "－ ");
		map.put('U', "ㆍㆍ－");
		map.put('V', "ㆍㆍㆍ－");
		map.put('W', "ㆍ－－ ");
		map.put('X', "－ㆍㆍ－ ");
		map.put('Y', "－ㆍ－－ ");
		map.put('Z', "－－ㆍㆍ");
		map.put(' ', "\n");

		// 입력하는 단어를 모스부호로 만드는 프로그램 만들어보기

		System.out.println("모스부호로 바꾸고자 하는 문자를 입력하세요.");
		String input = sc.nextLine();
		String line = input.toUpperCase();

		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			System.out.print(map.get(c));
			System.out.print("  ");
		}
	}
}
