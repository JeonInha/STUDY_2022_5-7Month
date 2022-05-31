class StudentS {
	private String name;
	private int ko;
	private int eg;
	private int mt;
	
	public StudentS(String name, int ko, int eg, int mt) {
		this.name = name;
		this.ko = ko;
		this.eg = eg;
		this.mt = mt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = ko;
	}

	public int getEg() {
		return eg;
	}

	public void setEg(int eg) {
		this.eg = eg;
	}

	public int getMt() {
		return mt;
	}

	public void setMt(int mt) {
		this.mt = mt;
	}

	public double getAv() {
		return (double)(ko+eg+mt)/3;
	}
	
}

class Class {
	private StudentS s1;
	private StudentS s2;
	private StudentS s3;
	
	public Class(StudentS s1, StudentS s2, StudentS s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public StudentS getS1() {
		return s1;
	}

	public void setS1(StudentS s1) {
		this.s1 = s1;
	}

	public StudentS getS2() {
		return s2;
	}

	public void setS2(StudentS s2) {
		this.s2 = s2;
	}

	public StudentS getS3() {
		return s3;
	}

	public void setS3(StudentS s3) {
		this.s3 = s3;
	}
	
	public void printAllName() {
		System.out.println("학생 1: "+s1.getName());
		System.out.println("학생 2: "+s2.getName());
		System.out.println("학생 3: "+s3.getName());
	}
	
	public double printAlAv() {
		double allAv=(double)(s1.getAv()+s2.getAv()+s3.getAv())/3;
		return allAv;
	}
	
	public StudentS comparAv() {
		if (s3.getAv()>s2.getAv()&&s3.getAv()>s1.getAv()) {
			return s3;
		} else if (s2.getAv()>s1.getAv()) {
			return s2;
		} else { 
			return s1;
		}
	}
	
	public void ifToMany1st() {
		if (comparAv().equals(s1)) {
			if (s1.getAv()==s2.getAv()) {	
				System.out.printf(", %s", s2.getName());
			} 
			if (s1.getAv()==s3.getAv()) {
				System.out.printf(", %s", s3.getName());
			}	
		}
		if (comparAv().equals(s2)) {
			if (s2.getAv()==s3.getAv()) {
				System.out.printf(", %s", s3.getName());
			} 
		}
	}
	
}

public class Ex1_Class {
	public static void main(String[] args) {
	StudentS s1=new StudentS("다오", 50, 50, 50);
	StudentS s2=new StudentS("베찌", 50, 50, 50);
	StudentS s3=new StudentS("디지니", 50, 50, 50);
	Class c=new Class(s1, s2, s3);
	
	System.out.println("학급 학생들의 정보 출력");
	c.printAllName();
	System.out.println("********************");
	System.out.println("학급 학생들의 전체 평균 출력");
	System.out.println(c.printAlAv());
	System.out.println("********************");
	System.out.println("평균 1등 학생은? (같을 경우 학생번호가 빠른 학생 우선출력)");
	System.out.print(c.comparAv().getName());
	c.ifToMany1st();
	}
}

