import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1_618p {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		// 파일 내용을 byte 단위로 읽는 객체
		FileOutputStream out = null;
		// 파일 내용을 byte 단위로 출력하는 객체
		
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			int c;
			
			// 하나씩 읽어오는데 끝은 -1 //
			while ((c=in.read())!= -1) {
				out.write(c);
				System.out.print(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out!=null) {
				out.close();
			}
		}

	}

}
