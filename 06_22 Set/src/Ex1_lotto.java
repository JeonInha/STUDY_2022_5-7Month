import java.util.*;

public class Ex1_lotto {
	public static void main(String[] args) {
		Set<Integer> lottoSet = new HashSet<>();
		Random r = new Random();

		while (lottoSet.size() < 6) {
			lottoSet.add(r.nextInt(45) + 1);
		}
		System.out.println(lottoSet);
		
		// 오름차순 순으로 보고싶을땐?
		List<Integer> list = new ArrayList<>(lottoSet);
		Collections.sort(list);
		System.out.println(list);
	}
}
