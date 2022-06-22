import java.util.*;

public class Main4_set {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		
		Set<Integer> setUnion = new HashSet<>();	// a와 b를 다 넣어서 중복 제거한 배열 만들려구 함
		setUnion.addAll(setA);	// addAll 메소드 사용; 간편하게 전부 집어넣기
		setUnion.addAll(setB);
		System.out.println(setUnion);	// 합집합을 만들어냄,.... 
		
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB);	// 교집합을 만들어 냄.,...
		System.out.println(setDuplicate);
		
		Set<Integer> setLeftOuter = new HashSet<>(); // 차집합 만들어보장
		setLeftOuter.addAll(setA);	// addAll 메소드 사용; 간편하게 전부 집어넣기
		setLeftOuter.removeAll(setB); // 집합 A에서 집합 B를 뺌
		System.out.println(setLeftOuter);
		
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7, 6, 5, 4, 3, 2, 1));
		System.out.println(setSame.equals(setUnion));
		// 집합이 동일한지 확인; 여기서 원소의 순서는 신경쓰지 않음
	}
}
