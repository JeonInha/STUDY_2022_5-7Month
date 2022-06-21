import java.util.*;

class JudgeAge implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int score;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "[" + name + " / " + age + "세  / "+score+"점 ]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student)
			return (this.getAge()==((Student) obj).getAge()&&this.getName()==((Student) obj).getName());
			else return false;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return this.getScore()-o.getScore();
	}
}
public class Main6_listWithObject {
	public static void main(String[] args) {
		List<Student> c1 = new LinkedList<>();
		c1.add(new Student("홍길동", 33, 90));
		c1.add(new Student("둘리", 22, 80));
		c1.add(new Student("도우너", 19, 70));
		
		System.out.println(c1);
		System.out.println(c1.indexOf(new Student("도우너", 19)));
		
		// 정렬
		Collections.sort(c1);
		System.out.println(c1);
		
		Comparator<Student> compareName = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Collections.sort(c1, compareName);
		System.out.println(c1);

	}

}
