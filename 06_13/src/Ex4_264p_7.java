class Studentss {
	private String name;
	private int stuNum;
	private String major;
	private int grade;
	private int credit;
	
	public Studentss(String name, int stuNum, String major, int grade, int credit) {
		super();
		this.name = name;
		this.stuNum = stuNum;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
}

class UnderGraduate extends Studentss {
	
	private String clubName;
	
	public UnderGraduate(String name, int stuNum, String major, int grade, int credit, String clubName) {
		super(name, stuNum, major, grade, credit);
		this.clubName=clubName;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

}

class Graduate extends Studentss {
	private boolean taType;
	private double scholarshipRate;
	
	
	public Graduate(String name, int stuNum, String major, int grade, int credit, boolean taType, double scholarshipRate) {
		super(name, stuNum, major, grade, credit);
		this.taType = taType;
		this.scholarshipRate=scholarshipRate;
	}

	public boolean isTaType() {
		return taType;
	}

	public void setTaType(boolean taType) {
		this.taType = taType;
	}
	
	public String taTypeToString(boolean ta) {
		if(ta==true) return "교육 조교";
		else return "연구 조교";
	}

	public double getScholarshipRate() {
		return scholarshipRate;
	}

	public void setScholarshipRate(double scholarshipRate) {
		this.scholarshipRate = scholarshipRate;
	}

}

public class Ex4_264p_7 {

	public void printAll(UnderGraduate a) {
		System.out.println("이름: "+a.getName());
		System.out.println("학번: "+a.getStuNum());
		System.out.println("전공: "+a.getMajor());
		System.out.println("학년: "+a.getGrade());
		System.out.println("이수학점: "+a.getCredit());
		System.out.println("동아리명: "+a.getClubName());
	}
	
	public void printAll(Graduate a) {
		System.out.println("이름: "+a.getName());
		System.out.println("학번: "+a.getStuNum());
		System.out.println("전공: "+a.getMajor());
		System.out.println("학년: "+a.getGrade());
		System.out.println("이수학점: "+a.getCredit());
		System.out.println("조교 유형: "+a.taTypeToString(a.isTaType()));
		System.out.println("장학금 비율: "+a.getScholarshipRate());
	}
	
	public static void main(String[] args) {
		UnderGraduate a=new UnderGraduate("mike", 0101, "english", 3, 18, "fly");
		Graduate b=new Graduate("mike", 0101, "english", 3, 18, true, 0.8);
		Ex4_264p_7 c=new Ex4_264p_7();
		c.printAll(a);
		c.printAll(b);
	}
}
