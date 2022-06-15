interface IHelloable {
	public void sayhello();
}

interface EngHello extends IHelloable {
	void howoldru();
}

interface KorHello extends IHelloable {
	void howoldru();
}


class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
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

class UKstudents extends Student implements IHelloable {
	public UKstudents(String name, int age) {
		super(name, age);
	}

	@Override
	public void sayhello() {
		System.out.println("Hello");
	}
}

class KORstudents extends Student implements KorHello {
	public KORstudents(String name, int age) {
		super(name, age);
	}

	@Override
	public void sayhello() {
		System.out.println("안녕!");
	}

	@Override
	public void howoldru() {
		System.out.println("나이가 어떻게 되니");
	}
	
	
}

class USApeople implements IHelloable {

	@Override
	public void sayhello() {
		System.out.println("Wassup?");
	}
}

public class Ex1_Interface_Student {
	public static void main(String[] args) {
		// 인터페이스의 형으로 테스트
		IHelloable a = new KORstudents("철수", 22);
		IHelloable a1 = new UKstudents("철수", 22);
		IHelloable a2 = new USApeople();
		
		IHelloable[] arr=new IHelloable[3];
		arr[1] = a;
		arr[2] = a1;
		arr[0] = a2;
		
		for (IHelloable obj : arr) {
			obj.sayhello();
		}
	}
}
