import java.util.ArrayList;
import java.util.List;

public class Main3_ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.toString());

		// List: 인터페이스. ArrayList는 이 인터페이스를 사용하구있음
		
		// 값 변경
		list.set(1, 15);	// list.set(인덱스, 변경값)
		System.out.println(list);
		System.out.println(list.contains(20)); 	// 특정 값 있는지 찾기
		System.out.println(list.indexOf(30));	// 인덱스값 반환
		
		list.remove(1);	// 인덱스 1번을 제거하고 배열의 사이즈가 변경된 뒤 뒤의 인덱스를 앞으로 땡김
		System.out.println(list);
		System.out.println(list.get(1));
		
		list.add(0, 999); 	// 배열의 사이즈가 늘어난 뒤 해당 인덱스에 값을 넣고 뒤의 인덱스들은 뒤로 밀려남
		System.out.println(list);
		
		list.clear();//리스트 삭제
		System.out.println(list);
		//for문으로 remove를 돌리는것보다 clear를사용하는 것을 권장. 반복문은 인덱스가 땡겨지고 하면서 찌꺼기가 남을 수 있기 때문
		System.out.println(list.isEmpty()); // list가 비었는지 확인하는 메소드
	

	}

}
