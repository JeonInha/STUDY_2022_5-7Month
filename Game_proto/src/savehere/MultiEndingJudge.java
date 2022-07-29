package savehere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiEndingJudge {
	// 노말 엔딩 조건
	List<Integer> normalEndingC1 = Arrays.asList(2, 3);
	
	// 배드엔딩 조건
	List<Integer> BadEndingC1 = Arrays.asList(1, 4);
	
	// 리얼엔딩 조건
	List<Integer> realC1 = Arrays.asList(6, 5);
	
	// 유저 정보::
	List<Integer> userC1;
	List<Integer> userC2;
	
	
	List<Integer> getStrToInt(String arr) {
		List<Integer> arr2 = new ArrayList<>();
		
		arr = arr.replace(" ", "").replace("[", "").replace("]", "");
        String[] saveArr2 = arr.split(",");
        
        for (String a : saveArr2) {
        	arr2.add(Integer.valueOf(a));
        }
		return arr2;
	}
	
	List<Integer> getUserC1Path(SaveHere user) {
		String storyPath1 = user.getStroyPath1();
		List<Integer> arr = getStrToInt(storyPath1);
		
		if (arr.contains(realC1)) {
			System.out.println("real");
		} else if (arr.contains(normalEndingC1)) {
			System.out.println("노멀");
		} else if (arr.contains(BadEndingC1)) {
			System.out.println("배드");
		}
		
		return arr;
	}
	
	List<Integer> getUserC2Path(SaveHere user) {
		List<Integer> arr = new ArrayList<>();
		return arr;
	}
	
	public static void main(String[] args) {
		MultiEndingJudge a = new MultiEndingJudge();
		SaveHere user = new SaveHere("123", "[1, 2, 3, 4, 5, 6]");
		a.getUserC1Path(user);
	}
}
