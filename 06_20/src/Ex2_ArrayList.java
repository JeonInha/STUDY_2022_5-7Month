import java.util.*;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		Iterator<Integer> iter = list.iterator();
		
		int sum=0;
		int count23=0;
		for (int a : list) {
			sum+= a;
			if (a==23)
				count23++;
		}
		
		// 리스트에서 삭제도 가능한 게 인터렉터 (for-each는 삭제가 안되고 for문은 인덱스가 꼬임)

//		while (iter.hasNext()) {
//			int a = iter.next();
//			sum+=a;
//		}
		
		System.out.println(list);
		
		System.out.println("전 원소의 합: "+sum);
		System.out.println("리스트 평균: "+(sum / list.size()));
		
		if (list.indexOf(57)<0) {
			System.out.println("57은 리스트에 없음");
		} else 
			System.out.println("57의 인덱스: "+list.indexOf(57));
		
		System.out.println("23의 개수: "+count23);
		
		
		if (list.contains(23)) {
			list.remove(list.lastIndexOf(23));	// 바이너리서치:: 이진 검색을 함. 정렬을 먼저 해줘야 함.
//			list.remove(Integer.valueOf(23));   위랑 같은 결과
			System.out.println("23 1개 삭제");
		} else 
			System.out.println("삭제할 23이 없음");
		
		System.out.println(list);
	}

}
