import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.*;

class Student implements Serializable {
	private String name;
	private int age;
	private double score;
	
	@Override
	public String toString() {
		return String.format("[%s, %d, %.1f]", name, age, score);
	}

	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}
public class Main1 {
	public static void main(String[] args) {
		// 학생
		// 이름: 문자열
		// 나이: 정수
		// 학점: 실수
		
		List<Student> list = new ArrayList<>(Arrays.asList(new Student("홍길동", 22, 2.6), new Student("둘리", 33, 3.3), new Student("도우너", 44, 4.4)));

		// 이 데이터를 파일에 어떻게 담을까?
		// 데이터 구분자 약속 정하기
		File file = new File(".\\practice_txt\\student.txt");
		
		PrintWriter pw = null;
		try {
			System.out.println(file.getCanonicalPath());
			pw = new PrintWriter(file);
			for (int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			
			pw.println(s.getName());
			pw.println(s.getAge());
			pw.println(s.getScore());

			}
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
		
		/////////////////////////////////////////////////////
		List<Student> newList = new ArrayList<>();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			while (true) {
				String name = br.readLine();
				int age = Integer.valueOf(br.readLine());
				double score = Double.valueOf(br.readLine());
				Student st = new Student(name, age, score);
				System.out.println(st);
				newList.add(st);
			}
		
			
		} catch (IOException e) {		
			e.printStackTrace();
		} finally {
			if (br !=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
