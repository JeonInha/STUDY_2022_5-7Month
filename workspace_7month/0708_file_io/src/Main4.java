import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main4 {

	public static void main(String[] args) {
		File file = new File("d:\\dlsgk_practice\\lineio.txt");
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(file));
			
			pw.println("문자열 한줄을 출력합니다.");
			pw.println(10);
			pw.println(10.12);
			pw.println(1111111);
			pw.flush();
			// 물내리기?
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw !=null) {
				pw.close();
			}
		}

	}

}
