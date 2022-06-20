import java.util.ArrayList;

public class Main2_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 제네릭을 이용해 담을 타입 정하기
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
//		list.add.("asd"); // 제네릭으로 형을 지정하였는데 다른 형을 넣으려고해서, 에러0
		
		
		int sum = 0;
		for (int i = 0; i<list.size(); i++) {
			sum+=list.get(i);
		}
		
		System.out.println(sum);

	}

}
