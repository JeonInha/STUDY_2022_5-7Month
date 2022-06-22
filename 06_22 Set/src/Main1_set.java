import java.util.HashSet;
import java.util.Iterator;

public class Main1_set {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("qwer");
		set.add(Integer.valueOf(10));
		set.add("qwer");
		
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(set.toString());
		
		// set은 중복을 걸러주는 배열
		// boolean 데이터타입 변수에 값을 넣으면 원소가 제대로 들어갔는지 아닌지 알려줌.
		// 인덱스를 가지고 있지 않아서 get이라는 행동 자체가 없음.
		// 인덱스 번호를 이용한 for문으로 전체 목록 보기는 불가. (for-each문 이용)
		// 혹은 Iterator 사용 가능
		
		Iterator<Object> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}
}
