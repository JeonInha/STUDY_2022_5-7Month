import java.util.*;
public class Ex3_ArrayList {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>(Arrays.asList
				("apple", "banana", "carrot", "donut", "egg"));
		
		// 위의 리스트에서 문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성
		List<String> length4 = new ArrayList<>();
		for (int i=0; i<list.size(); i++)
			if (list.get(i).length()==5) length4.add(list.get(i));
		
		System.out.println(length4);
		
		
		
		// 문자열중에 'e' 문자를 포함하는 문자열만을 원소로 가지는 리스트 생성
		List<String> containE = new ArrayList<>();
		for (int i=0; i<list.size(); i++)
			if (list.get(i).contains("e"))
				containE.add(list.get(i));
		System.out.println(containE);
		
		
		// 정수 형태의 값을 가지는 문자열을 찾아 해당 원소를 가지는 정수형 리스트 생성
		List<String> list2 = new ArrayList<>(Arrays.asList("가", "나", "1", "@", "3", "8"));
		List<Integer> numList = new ArrayList<>();
		for (int i=0; i<list2.size(); i++) {
			try {
				numList.add(Integer.valueOf(list2.get(i)));
			} catch (NumberFormatException e) {
				System.out.print("문자열 예외는 건너뛰고 정상흐름으로 돌아가거라");
			}
		}
		
		System.out.println(numList);
		
 			

	}

}
