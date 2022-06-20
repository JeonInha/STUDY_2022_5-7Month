import java.util.*;

public class Main5_ArrayList {

	public static void main(String[] args) {
		// 생성자에 다른 리스트를 넣으면 그 리스트를 그대로 가지는 리스트를 만들 수 있음?
		int[] a = {10, 20, 30, 40};
		List<Integer> list = new ArrayList(Arrays.asList(10, 20, 30, 40));
		
		System.out.println(list);
		
		list.addAll(Arrays.asList(60, 70, 80));
		System.out.println(list);
		
		list.removeAll(Arrays.asList(30, 60, 20));
		System.out.println(list);
		
		System.out.println(list.containsAll(Arrays.asList(10)));
		
		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub);
		System.out.println(list);
		
	}

}
