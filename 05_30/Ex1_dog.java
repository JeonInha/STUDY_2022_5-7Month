import java.util.Scanner;

class Ex1_dog {
	private String name;
	private String breed;
	private int age;
	private String prt;
	
	public Ex1_dog(String n, String b, int a, String p) {
		name=n;
		breed=b;
		age=a;
		prt=p;
	}
	
	public Ex1_dog(String n, String b) {
		this(n, b, 1, "none");
	}
	
	public Ex1_dog() {
		this(null, null, 0, null);
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setBreed(String breed) {
		this breed=breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	
	public void setAge(int a) {
		age=a;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public void setPrt(String p) {
		prt=p;
	}
	
	public String getPrt() {
		return prt;
	}
	
	public void getAll() {
		System.out.println("****************");
		System.out.println("이름: "+getName());
		System.out.println("종: "+getBreed());
		System.out.println("나이: "+getAge());
		System.out.println("보호자: "+getPrt());
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("동물병원 고객 관리 프로그램");
		Ex1_dog bingo=new Ex1_dog("Bingo", "아프간 하운드", 5, "mike");
		bingo.setAge(6);
		bingo.getAll();
		
		Ex1_dog noname=new Ex1_dog("치즈", "mix");
		noname.getAll();
		System.out.print("새 주인을 입력하세요: ");
		noname.setPrt(sc.next());
		System.out.print("보호자: "+noname.getPrt());
		

	}

}