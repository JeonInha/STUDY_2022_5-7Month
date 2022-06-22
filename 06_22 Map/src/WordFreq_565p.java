import java.util.*;

public class WordFreq_565p {
	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();

		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem" };

		for (String a : sample) {
			Integer freq = m.get(a);	// key값이 없으면 null을 반환
			m.put(a, (freq == null) ? 1 : freq + 1);	// 3항 연산자: freq가 null이면 1 넣고 값이 있으면 1 더함
		}

		System.out.println(m.size() + " 단어가 있습니다");
		System.out.println(m.containsKey("to"));
		System.out.println(m.isEmpty());
		System.out.println(m);
		
		//////////////////////////////
		
		String line = "Hello. I'm a java developer.";

		Map<Character, Integer> a = new HashMap<Character, Integer>();
		for (int i=0; i<line.length(); i++) {
			char c=line.charAt(i);
			if (!a.containsKey(c))  {
				a.put(c, 1);
			} else {
				a.put(c, a.get(c)+1);
			}
		}
		
		System.out.println();
		System.out.println(a.size() + " 글자가 있습니다");
		System.out.println(a.containsKey('e'));
		System.out.println(a.isEmpty());
		System.out.println(a);
		
	}

}
