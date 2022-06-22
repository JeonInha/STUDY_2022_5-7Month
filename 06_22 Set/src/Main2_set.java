import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2_set {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		// 클래스 HashSet은 Set인터페이스를 구현
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");
		
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			// hashSet은 순서를 무시함. 중복 처리에 집중한 클래스.
		}
		
		set.contains("banana");
		set.contains("donut");
		// 가지고 있느냐 없느냐에도 집중.
		// 집합과같음

	}

}
