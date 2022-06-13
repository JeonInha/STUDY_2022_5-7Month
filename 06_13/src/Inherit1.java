class Person {
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	
}

class Student extends Person {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age); // 부모 클래스에 있는 필드는 부모의 생성자 호출
		this.score=score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

class Author extends Person {
	private String bookList;
	public Author(String name, int age, String bookList) {
		super(name, age);
		this.bookList=bookList;
	}
	public String getBookList() {
		return bookList;
	}
	public void setBookList(String bookList) {
		this.bookList = bookList;
	}
}

public class Inherit1 {
	public static void main(String[] args) {
		Student s=new Student("학생 이름", 17, 90);
		Author a=new Author("작가 이름", 30, "반지의 제왕");
		
		System.out.println(s.getName());
		System.out.println(s.getScore());
		System.out.println();
		System.out.println(a.getAge());
		System.out.println(a.getBookList());
		
		
	}
}