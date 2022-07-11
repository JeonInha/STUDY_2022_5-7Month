import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.*;

public class Ex2_644p {

	public static void main(String[] args) {

		List<Character> al = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));

		List<Character> input = new ArrayList<>();
		int key = 0;

		File inputPw = new File(".\\data_pc\\inputPw.txt");
		FileInputStream ir = null;
		int i = 0;

		System.out.println("밀고 당길 숫자를 설정하시오 (-26 ~ 26)");
		key = new Scanner(System.in).nextInt();

		// 암호문 읽는 부
		try {
			ir = new FileInputStream(inputPw);
			while ((i = ir.read()) != -1) {
				char b = (char) (i - 32);
				input.add(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ir != null) {
				try {
					ir.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		List<Character> output = new ArrayList<>();
		for (int j = 0; j < input.size(); j++) {
			int index = al.indexOf(input.get(j));

			if (index == -1) {
				output.add(input.get(j));
			} else {
				if (index + key >= 26) {
					output.add((char) (al.get(index + key - 26)));
				} else if (index + key < 0) {
					output.add((char) (al.get(index + key + 26)));
				} else {
					output.add((char) (al.get(index + key)));
				}
			}
		}

		FileOutputStream os = null;

		try {
			os = new FileOutputStream(".\\data_pc\\outputPw.txt");
			for (int j = 0; j < output.size(); j++) {
				System.out.print(output.get(j));
				os.write(output.get(j));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
