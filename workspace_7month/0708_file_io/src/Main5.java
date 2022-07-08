import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {

	public static void main(String[] args) {
		File file = new File("d:\\dlsgk_practice\\lineio.txt");
		
		BufferedReader br = null;
		
		try {
			br=new BufferedReader(new FileReader(file));
			br.readLine();
			String line;
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br !=null) {
				try {
					br.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
