import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3_Set_Remove_Overlap {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다", "다","다","다","가", "라"));
		// 중복 거르기
		Set<String> set = new HashSet<>();
		// Set을 만들어서 집어넣으면 알아서 중복을 걸러줌. HashSet은 그런 용도로 많이 사용함.
		for (int i=0; i<list.size(); i++) {	// for 문으로 하나하나 집어넣어주는 
			set.add(list.get(i));
		}
		System.out.println(set);
		
		Set<String> set2 = new HashSet<>(list); // list를 집어넣을 수 있음: 자동적으로 필요한 처리를 다 해줌,, 간편하당
 	}

}
