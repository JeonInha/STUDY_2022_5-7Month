import java.util.*;

class Student {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class MapTest_564p {
	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001, "구준표"));
		st.put("20090002", new Student(20090002, "금잔디"));
		st.put("20090003", new Student(20090003, "윤지후"));
		
		// 모든 항목 출력
		System.out.println(st);
		
		// 하나 삭제
		st.remove("20090001");
		// 하나 대치
		st.put("20090003", new Student(20090003, "소이정"));
		// 결과
		System.out.println(st.get("20090003"));
		
		// 인터페이스 안에 인터페이스가 있다,,,, Map 인터페이스 안의 Entry
		for(java.util.Map.Entry<String, Student> s: st.entrySet()) {
			String key=s.getKey();
			Student value = s.getValue();
			System.out.printf("[key = %s / Student = %s]", key, value);
		}

	}

}
