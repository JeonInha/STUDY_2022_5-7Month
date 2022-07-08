import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main6 {

	public static void main(String[] args) {
		Map<Integer, Set<Integer>> lotto = new LinkedHashMap<>();
		
		lotto.put(1000, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		lotto.put(1001, new HashSet<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12)));
		lotto.put(1002, new HashSet<Integer>(Arrays.asList(13, 14, 15, 16, 17, 18)));
		System.out.println(lotto.get(1001).toString());
		
		File lottoTxt = new File(".\\lotto.txt");
		PrintWriter pw = null;
		
		
		try {
			pw = new PrintWriter(new FileWriter(lottoTxt));
			
			for (Integer key : lotto.keySet()) {
				pw.print(key);
				pw.print(" : ");
				pw.println(lotto.get(key).toString());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw !=null) {
				pw.close();
			}
		}
		
		PrintWriter pw2 = null;
		
		try {
			pw2 = new PrintWriter(new FileWriter(lottoTxt, true));
			// 기존 정보 다음에 출력(있던 정보를 사라지게 하지 않음)
			pw2.println("1343 : [45, 43, 42, 41, 40, 44]");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw2.close();
		}
		


	}
}
