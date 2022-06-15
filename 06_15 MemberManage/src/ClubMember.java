class ClubMember extends Human {
	private String state;
	private double bmi;

	public ClubMember(String name, double tall, double weight) {
		super(name, tall, weight);
		bmi=setBMI();
		state=obesityJudge();
	}

	public String getState() {
		return state;
	}

	public double setBMI() {
		return getWeight() / ((getTall() / 100) * (getTall() / 100));
	}
	
	public double getBmi() {
		return bmi;
	}

	private String obesityJudge() {
		if (getBmi() >= 35) {
			return "고도비만";
		} else if (getBmi() >= 30) {
			return "중도비만";
		} else if (getBmi() >= 25) {
			return "경도비만";
		} else if (getBmi() >= 23) {
			return "과체중";
		} else if (getBmi() >= 18.5) {
			return "정상";
		} else
			return "저체중";
	}
	
	@Override
	public String toString() {
		return String.format(" %s\t | %.2f\t%.2f\t%.2f\t%s", getName(), getTall(), getWeight(), getBmi(), state);
	}
}