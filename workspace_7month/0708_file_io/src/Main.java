import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File diaryf = new File("d:\\dlsgk_practice\\test.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(diaryf);
			while (sc.hasNext()) {
			sc.nextLine();
			}
			// 스캐너로 파일을 읽음

		} catch (FileNotFoundException e) {
			System.out.println("파일 없어용~~");
		} finally {
			if (sc!=null) {
				sc.close();
			}
		}
	}

}
