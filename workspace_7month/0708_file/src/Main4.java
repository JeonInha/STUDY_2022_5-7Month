import java.io.File;
import java.io.IOException;

public class Main4 {

	public static void main(String[] args) {
		File fileKor = new File("d:\\dlsgk_practice\\한글이름.txt");

		try {
			System.out.println("생성됨?  " + fileKor.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileKor.renameTo(new File("d:\\dlsgk_practice\\newName.txt"));
		// 왜 안바뀌지 ...?
		// 영어이름으로만 바뀌나 .......?
		
		File mytext = new File("d:\\dlsgk_practice\\mytext.txt");
		mytext.delete();

	
	}

}
