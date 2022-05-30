class Student {
	private String name;
	private int ko;
	private int eg;
	private int mt;
	
	public Student(String n, int k, int e, int m) {
		name=n;
		ko=k;
		eg=e;
		mt=m;
	}
	
	public Student(String n) {
		this(n, 0, 0, 0);
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setScore(int k, int e, int m) {
		ko=k;
		eg=e;
		mt=m;
	}
	
	public int getKo() {
		return ko;
	}
	
	public int getEg() {
		return eg;
	}
	
	public int getMt() {
		return mt;
	}
	
	public double getAverage() {
		double average= ((double)ko+(double)eg+(double)mt)/3;
		return average;
	}
}

public class Ex2_student {
	public static void main(String[] args) {
		
		Student a=new Student("아름", 71, 67, 83);
		System.out.println("이름: "+a.getName());
		System.out.println("평균은: "+a.getAverage());
		
		
		
		
	}
}
// 이름

// 국어점수
// 영어점수
// 수학점수

// 생성자
// 게터 세터
// 학생들의 평균점수 알려주는 메소드

