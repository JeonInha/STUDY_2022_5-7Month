import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1_644p {

	public static void main(String[] args) {

		File file = new File(".\\data_pc\\numbers.txt");
		PrintWriter pw = null;
		BufferedReader br = null;
		List<Double> number = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader(file));

			while (true) {
				number.add(Double.valueOf(br.readLine()));
			}

		} catch (FileNotFoundException e) {
		} catch (NumberFormatException | IOException e) {
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		Collections.sort(number);

		try {
			pw = new PrintWriter(new File(".\\data_pc\\numbersort.txt"));
			for (int i=0; i<number.size(); i++) {
				pw.println(number.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
