import java.util.Scanner;	// 입력에 필요하여 스캐너 클래스를 import

class Student { // 학생 클래스
	private String name; // 이름
	private int ko; // 국어 성적
	private int eg; // 영어 성적
	private int mt; // 수학 성적

	public Student(String name, int ko, int eg, int mt) { // 생성자
		this.name = name;
		this.ko = ko;
		this.eg = eg;
		this.mt = mt;
	}

	/*
	 * 06. 02. 디폴트 생성자 생성
	 */
	public Student() {
		this(null, 0, 0, 0);
	}

	public String getName() { // getter
		return name;
	}

	public void setName(String name) { // setter
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

	public double getAvg() { // 평균값 리턴
		return (double) (ko + eg + mt) / 3;
	}

	/*
	 * 06. 02. 학생정보를 콘솔로 입력받는 메소드 생성
	 */
	public void inputSInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 이름 입력: ");
		setName(sc.next());
		System.out.printf("%s 학생 국어 / 영어 / 수학 점수 입력: ", name);
		setKo(sc.nextInt());
		setEg(sc.nextInt());
		setMt(sc.nextInt());
	}

	/*
	 * 06. 02. 학생 정보를 전부 출력하는 메소드 생성
	 */
	public void printAll() {
		System.out.printf("학생 이름: %s\n", getName());
		System.out.printf("국어 점수: %s\n", getKo());
		System.out.printf("영어 점수: %s\n", getEg());
		System.out.printf("수학 점수: %s\n", getMt());
		System.out.printf("평균 점수: %f\n", getAvg());
	}
}
