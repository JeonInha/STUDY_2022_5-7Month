import java.io.File;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		File file = new File("d:\\dlsgk_practice\\test");
		System.out.println("있니?  "+file.isDirectory());
		System.out.println("폴더? "+file.isDirectory());
		System.out.println("파일? "+file.isFile());
		
		boolean result = file.mkdir();
		System.out.println("생성됨?: "+result);
		
		//D 드라이브에 filetest폴더(디렉토리) 안에 abc 폴더를 생성해보세요
		
		File abc = new File("d:\\dlsgk_practice\\test\\abc");
		abc.mkdir();
		
		
		File def = new File(abc.getParent()+"\\def");
		def.mkdir();
		
		System.out.println();
		File textFile = new File("d:\\dlsgk_practice\\mytext.txt");
		try {
			boolean result2 = textFile.createNewFile();
			System.out.println("생성됨?  "+result2);
			System.out.println("이미 있음?  "+textFile.isFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
