import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main_HashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("일", 1);
		map.put("이", 2);
	
		
		System.out.println(map.size());
		
		System.out.println(map.get("일"));
		System.out.println(map);
		
		map.put("이", 2222);
		System.out.println(map.get("이"));
		
		////////////////////////////////
		//key: 단어명
		//value: 값
		////////////////////////////////
		
		Map<String, Integer> map2 = new HashMap<>();
		// 제네릭에 key, value순으로 들어감
		map2.put("둘리", 100);
		map2.put("홍길동", 90);
		map2.put("도우너", 150);
		
		Map<Integer, String> map3 = new HashMap<>();
		map3.put(1, "둘리");
		map3.put(2, "홍길동");
		map3.put(3, "도우너");
		
		System.out.println(map3);
		
		// Map을 하나하나 보고싶을 땐;
		System.out.println(map.keySet());	// key를 set으로 관리
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		
		// 1번 방법
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map2.get(key);
			
			System.out.println(key+"="+value);
		}
		
		// 2번 방법
		for (String key : keySet) {
			System.out.println(key+"="+map.get(key));
		}
		
		// 3번 방법
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		// Entry : key와 value를 한 값으로 묶은 짝.
		// 다른 언어들에서는 pair라고도 많이 부름
		
		
		
		
		
	}

}
