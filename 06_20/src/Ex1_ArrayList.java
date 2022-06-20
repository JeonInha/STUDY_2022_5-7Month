import java.util.*;

public class Ex1_ArrayList {

	public static int randomNoOverlap(List<Integer> a) {
		Random random = new Random();
		int num;
		do {
			num = random.nextInt(11);
			if (a.contains(num))
				continue;
		} while (a.contains(num));
		return num;
	}

	public static void main(String[] args) {

		// 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화
		List<Integer> a = new ArrayList<>();

		for (int i = 1; i <= 5; i++)
			a.add(2 * i);

		System.out.println(a);

		// 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화

		List<Integer> b = new ArrayList<>();

		for (int i = 1; i <= 5; i++)
			b.add(7 * i);

		System.out.println(b);

		// 위의 리스트 원소들을 모두 가지는 리스트

		List<Integer> c = new ArrayList<>(a);
		c.addAll(b);
		System.out.println(c);

		// 3번의 리스트를 오름차순으로 정렬된 원소를 가지는 새 리스트 생성
		List<Integer> d = new ArrayList<>(c);
		Collections.sort(d);
		System.out.println(d);

		// random 사용하여 0~10 사이의 정수 6개를 가지는 리스트. 단 숫자값은 중복되지 않아야 함.

		List<Integer> e = new ArrayList<>();

		for (int i = 0; i < 6; i++) 
			e.add(randomNoOverlap(e));

		System.out.println(e);
		
		// 위에거와 안겹치는 리스트!
		
		List<Integer> g = new ArrayList<>();
		do {
		for (int i = 0; i < 6; i++) 
			g.add(randomNoOverlap(g));
		
		if (e.equals(g))
			g.clear();
		
		} while (e.equals(g));

		System.out.println(g);
	}
}