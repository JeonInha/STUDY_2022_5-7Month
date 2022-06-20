import java.util.*;

public class Main4_ArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		list.add("banana");
		list.add("banana");
		
		System.out.println(list.contains(new String("banana")));	// equals와 유사한 작동
		list.remove("banana");	// 하나만 지워줌. 인덱스 앞
		System.out.println(list);
	
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기 하려면?
		// List가 상속하고 있는 iterable을 이용
		
		list.iterator(); // 원소를 하나하나 살펴보는데에 이용하는 메소드
		Iterator<String> interator = list.iterator();
		
		
		while (interator.hasNext()) {
		 // 다음 원소가 있는지를 boolean값으로 알려줌
			String str = interator.next();
		if (str.length()==5) {
			interator.remove();	// interator보고 지워달라고 요구.
		}
		
	}
		System.out.println(list);
	}

}
