import java.io.File;
import java.io.IOException;


// 상대경로
public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(".\\");
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath());
		try {
		System.out.println(file.getCanonicalPath());
		// 상대경로를 절대경로로 변환
		// AbsolutePath: . 을(현재 경로) 우리가 해석
		// CanonicalPath: . 을 자동으로 해석해줌
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 부모경로
		System.out.println();
		File fileParaent = new File("..\\");
		System.out.println(fileParaent.getAbsolutePath());
		try {
		System.out.println(fileParaent.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// 파일 객체의 부모 파일
		System.out.println();
		try {
		File file3 = file.getCanonicalFile().getParentFile();
		// CanonicalPath:: 경로를 문자열로 반환
		// CanonicalFile:: 파일 객체로 반환
		
		System.out.println(file3.getAbsolutePath());
		System.out.println(file3.getCanonicalPath());
		
		System.out.println(fileParaent.equals(file3));	// 파일형식이달라서
		System.out.println(fileParaent.compareTo(file3));
		
		System.out.println(fileParaent.getCanonicalFile().equals(file3));
		System.out.println(fileParaent.getCanonicalFile().compareTo(file3));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
