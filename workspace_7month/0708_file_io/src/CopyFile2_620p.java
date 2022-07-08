import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2_620p {

	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("output2.txt");
			int c;
			
			// 하나씩 읽어오는데 끝은 -1 //
			while ((c=inputStream.read())!= -1) {
				outputStream.write(c);
				System.out.print((char)c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream!=null) {
				outputStream.close();
			}
		}


	}

	private static char[] charAt(int c) {
		// TODO Auto-generated method stub
		return null;
	}

}
