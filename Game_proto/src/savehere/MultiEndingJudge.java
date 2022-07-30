package savehere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiEndingJudge {
	static final int REAL_ENDING = 1;
	static final int NORMAL_ENDING = 2;
	static final int BAD_ENDING = 3;
	
	// 배드엔딩 조건
	List<Integer> badC1 = Arrays.asList(1, 4);
	List<Integer> badC2 = Arrays.asList(1, 4);
	
	// 리얼엔딩 조건
	List<Integer> realC1 = Arrays.asList(6, 5);
	List<Integer> realC2 = Arrays.asList(6, 5);
	
	
	List<Integer> getStrToInt(String arr) {
		List<Integer> arr2 = new ArrayList<>();
		
		arr = arr.replace(" ", "").replace("[", "").replace("]", "");
        	String[] saveArr2 = arr.split(",");
        
        	for (String a : saveArr2) {
        		arr2.add(Integer.valueOf(a));
       		}
		return arr2;
	}
	
	boolean isContain(List<Integer> userPath, List<Integer> endingPath) {
		int count = 0;
		for (int i=0; i<endingPath.size(); i++) {	
			if (userPath.contains(endingPath.get(i)))
				count++;
		}
		if (count == endingPath.size()) {
			return true;
		}
		return false;
	}
	
	int getEndingNum(SaveHere user) {
		String storyPath1 = user.getStoryPath1();
		String storyPath2 = user.getStoryPath2();
		
		List<Integer> arr = getStrToInt(storyPath1);
		List<Integer> arr2 = getStrToInt(storyPath2);
		
		if (isContain(arr, realC1)) {
			if (isContain(arr2, realC2)) {
			ending = REAL_ENDING;
			}
		} else if (isContain(arr, badC1)) {
			if (isContain(arr2, badC2)) {
				ending = BAD_ENDING;
			}
		} else {
			ending = NORMAL_ENDING;
		} 
		return ending;
	}
	
	
	public static void main(String[] args) {
		MultiEndingJudge a = new MultiEndingJudge();
		SaveHere user = new SaveHere("123", "[1, 2, 3, 4, 5, 6]");
		a.getUserC1Path(user);
	}
}
