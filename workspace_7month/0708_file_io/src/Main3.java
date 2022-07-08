import java.io.File;
import java.io.FileInputStream;

public class Main3 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			File file = new File("d:\\dlsgk_practice\\practice.txt");
			int length = (int)file.length();
			byte[] buf = new byte[3];
			fis = new FileInputStream(file);
			fis.read(buf);
			String result = new String(buf);
			System.out.println(result);
			
			for (byte a : buf) {
				System.out.print((char)a);
			}
			
			System.out.println();
			System.out.println((char)buf[1]);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
