import java.util.ArrayList;

public class Main1_ArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
		
		// 배열처럼 여러개의 자료를 가질 수 있는 객체
		
		list.add(500);	// auto-boxing
		list.add(123.123);	//auto-boxing
		
		System.out.println(list);
		
		int size = list.size();
		System.out.println(size);
		
		
		for (int i = 0; i <list.size(); i++) {	// 출력
			System.out.println(list.get(i));
		}
		
		for (Object o : list) {
			System.out.println(o);
		}
		
		
		
		

	}

}
