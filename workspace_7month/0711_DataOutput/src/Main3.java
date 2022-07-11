import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>(Arrays.asList(new Student("홍길동", 22, 2.6),
				new Student("둘리", 33, 3.3), 
				new Student("도우너", 44, 4.4)));
		
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(new File(".\\data_pc\\student.dat")));
			
			
			for (int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			
			dos.writeUTF(s.getName());
			dos.writeInt(s.getAge());
			dos.writeDouble(s.getScore());
			}
			dos.flush();
		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			if (dos!=null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		List<Student> newList3 = new ArrayList<>();
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(new FileInputStream(new File(".\\data_pc\\student.dat")));
			while (true) {
			String name = dis.readUTF();
			int age = dis.readInt();
			double score = dis.readDouble();
			Student s = new Student(name, age, score);
			newList3.add(s);
			}
		} catch (FileNotFoundException e) {
			e.getStackTrace();
			System.out.println("파일 다 읽었음");
		} catch (IOException e) {
			
		} finally {
			if (dis != null) {
				try {
					System.out.println("끝났당");
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(newList3);
		
		
	}
}
