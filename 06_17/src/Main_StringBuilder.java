import java.util.StringJoiner;

public class Main_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("원본");
		sb.append(", One=");	// 같은 참조로
		sb.append(1)
			.append(", Double=")
			.append(23.43);
		
//		sb.reverse();
		
		String result = sb.toString();
		System.out.println(result);
		
		sb.setCharAt(0, 'Q');	// 0번째 글자를 Q로 변경
//		sb.replace(start, end, str);	// 이건 뭘까 ...
		sb.insert(0, "시작");	// 0번째에 "시작" 삽입
		
		
		StringBuffer sbuffer;
		StringJoiner joiner;
		
		
		
		
		
		
		
//		String str = "원본 문자열";
//		String other = "다른 문자열";
//		String origin = "원본 문자열";
//		
//		String concat = str + other;
//		System.out.println(concat);
//		System.out.println("원본 문자열다른 문자열"==concat);
//		
//		System.out.println(str=origin);

	}

}
