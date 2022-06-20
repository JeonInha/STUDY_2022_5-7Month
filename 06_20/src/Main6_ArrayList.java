import java.util.*;

public class Main6_ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 11));

		
		Collections.sort(list);	// 오름차순 정렬
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 8);
		System.out.println("8의 인덱스: "+index);
		
		Collections.reverse(list);	// 내림차순 정렬
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		Collections.fill(list, 33);
		System.out.println(list);
		list.add(8);
		
		Collections.replaceAll(list, 33, 77);
		System.out.println(list);
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		Collections.copy(list, target);
		
		System.out.println(list);
	}

}
