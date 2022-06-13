class Employee {
	public String name;	// 이름
	String address;		// 주소
	protected int salary;	// 월급
	private int RRN;		// 주민번호
	
	public Employee() {
		
	}
	
	public Employee(String name, String address, int salary, int rRN) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		RRN = rRN;
	}



	public String toString() {
		return name+", "+address+", "+RRN+", "+salary;
	}
}

class Manager extends Employee {
	private int bonus;
	
	public Manager(String name, String address, int salary, int rRN, int bonus) {
		super(name, address, salary, rRN);
		this.bonus=bonus;
	}
	
	public Manager() {
//		super();		// 생략 가능
	}

	
	
	public void printSalary() {
		System.out.printf("%s(%s): %d", name, address, salary+bonus);
	}
	
	public void printRRN() {
//		System.out.println(RRN); // 오류! PRIVATE에 접근
	}
}

public class ManagerTest_247p {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.printRRN();
		
	}
}
