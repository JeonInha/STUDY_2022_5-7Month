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
}

