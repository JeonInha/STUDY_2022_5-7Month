import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main4 {

	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File(".\\data_pc\\s1.ser")));
			
			oos.writeObject(new Student("용감한쿠키", 8, 3.0));
			// 그냥 실행하면 에러남: 직렬화가 불가능해서.
			// 직렬화: 흩어진 정보들을 디스크조각모음하듯이 한군데로 예쁘게 모음
			// 해결방법: 클래스에서 Serializable를 implements 하기
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		//////////////////////////////////////////////////
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(".\\data_pc\\s1.ser"));
			
			Student s = (Student) ois.readObject();
			// 다운캐스팅 필수
			System.out.println(s);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ois !=null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
	}
}
