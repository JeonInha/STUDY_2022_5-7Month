class Class { // 학생 셋이 들어간 학급 클래스
	private Student s1; // 학생 클래스의 객체에 대한 참조를 멤버로서 가짐.
	private Student s2;
	private Student s3;

	public Class(Student s1, Student s2, Student s3) { // 설정자
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public Student getS1() {
		return s1;
	}

	public void setS1(Student s1) {
		this.s1 = s1;
	}

	public Student getS2() {
		return s2;
	}

	public void setS2(Student s2) {
		this.s2 = s2;
	}

	public Student getS3() {
		return s3;
	}

	public void setS3(Student s3) {
		this.s3 = s3;
	}

	public void printAllName() { // print메소드로 학생들의 이름을 출력
		System.out.println("학생 1: " + s1.getName());
		System.out.println("학생 2: " + s2.getName());
		System.out.println("학생 3: " + s3.getName());
	}

	public double printAlAvg() { // 평균값을 실수형으로 구함.
		double allAv = (double) (s1.getAvg() + s2.getAvg() + s3.getAvg()) / 3;
		return allAv;
	}

	public Student comparAvg() { // 평균 1등 학생을 구하기. 출석번호가 빠른 친구를 우선순위로. return타입은 학생 클래스의 객체로.
		if (s3.getAvg() > s2.getAvg() && s3.getAvg() > s1.getAvg()) { // if문의 서순을 통해 우선순위 조절
			return s3;
		} else if (s2.getAvg() > s1.getAvg()) {
			return s2;
		} else {
			return s1;
		}
	}

	public void ifToMany1st() { // 번외: 동점자 출력. return값 갯수에 변동이 있는 것은 할 수 없어 문자열 출력으로 처리)
		if (comparAvg().getAvg() == s2.getAvg() && comparAvg() != s2) {
			System.out.printf(", %s", s2.getName());
		}
		if (comparAvg().getAvg() == s3.getAvg() && comparAvg() != s3) {
			System.out.printf(", %s", s3.getName());
		}
	}
}
