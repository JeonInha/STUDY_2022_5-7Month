import java.io.File;

//07 08 파일 입출력

//파일: 위치와 내용을 가지고 있음. 드라이브의 특성 상 PC가 꺼져도 기록이 남아있음. 
// 이러한 파일들을 자바 소프트웨어에서 소통하고자 함.

public class Main {
// 절대경로
	public static void main(String[] args) {
		File file = new File("d:\\dlsgk_practice\\test.txt");
		// TODO Auto-generated method stub
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		File f2 = new File("d:\\dlsgk_practice\\fdswaf.txt");
		// 실제 파일을 만든 게 아니라 파일 위치를 가리키는 객체를 만든 것이기 때문에 
		// 실제 파일이 존재하지 않지만 방금 만든 이름과 경로가 존재함 (그러나 exists()로
		// 존재여부를 확인하면 false가 나옴. 없으니까.)
		System.out.println();
		System.out.println(f2.getName());
		System.out.println(f2.getPath());
		System.out.println(f2.exists());
		
		File dir = new File("d:\\dlsgk_practice\\춘식");
		// 디렉터리도 가리킬 수 있음
		System.out.println();
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		System.out.println("dir는 파일인가요?  " + dir.isFile());
		System.out.println("dir는 디렉토리인가요?  "+ dir.isDirectory());

	}

}
