class Human {
	private String name;
	private int age;
	private String profession;
	
	public Human(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession=profession;
	}
	
	public String toString() {
		return String.format("(%s, %d세)", name, age);
	}
	
	public String gatProfession() {
		return "직업: "+profession;
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
	
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}

class Students extends Human {
	
	private String major;
	public Students(String name, int age, String profession, String major) {
		super(name, age, profession);
		this.major=major;
	}
	
	@Override
	public String gatProfession() {
		return major+"전공 "+getProfession();
	}
	
	@Override
	public String toString() {
		return super.toString()+getProfession()+", "+major+" 전공";
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}

public class Ex3_359p_1 {
	public static void main(String[] args) {
	Human a=new Human("춘향", 18, "춘향");
	Human b=new Human("몽룡", 21, "춘향");
	Human c=new Human("사또", 50, "춘향");
	
	Students a1=new Students("명진", 21, "학생", "컴퓨터");
	Students a2=new Students("미현", 22, "학생", "경영");
	Students a3=new Students("용준", 24, "학생", "경제");
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	}

}
