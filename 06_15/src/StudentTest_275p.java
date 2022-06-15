import java.util.Arrays;

class StudentS implements Comparable {
	private String name;
	private double gpa;
	
	public StudentS(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Object o) {
		StudentS other = (StudentS) o;
		if (this.gpa<other.gpa) return -1;
		else if (this.gpa>other.gpa) return 1;
		return 0;
	}
}


public class StudentTest_275p {
	public static void main(String[] args) {
		StudentS[] class1 = new StudentS[3];
		class1[0] = new StudentS("홍길동", 3.39);
		class1[1] = new StudentS("임꺽정", 4.21);
		class1[2] = new StudentS("황진이", 2.19);
		
		Arrays.sort(class1);
		for (StudentS s: class1)
			System.out.printf("%s, %.2f\n", s.getName(), s.getGpa());
	}
}
