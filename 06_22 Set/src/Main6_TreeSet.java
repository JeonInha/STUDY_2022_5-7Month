import java.util.Set;
import java.util.TreeSet;

public class Main6_TreeSet {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();	// 나무와 같이 동작. 대소비교, 순서정렬.
		// 오름차순. (String은 알파벳 한글 등등의 오름차순)
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(50);
		set.add(22);
		set.add(17);
		set.add(30);
		
		for (int i : set) {
			System.out.println(i);
		}

	}

}
