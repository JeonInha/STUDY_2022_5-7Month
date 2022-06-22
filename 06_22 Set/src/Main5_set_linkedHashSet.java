import java.util.*;
public class Main5_set_linkedHashSet {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();	// 입력순서를 기억
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");
		set.add("donut");
		
		for (String s : set) {
			System.out.println(s);
		}
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple", "donut", "egg", "fanta"));
		set.addAll(set2);
		System.out.println(set);
	}

}
