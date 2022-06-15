class Human {
	private String name;
	private double tall;
	private double weight;

	public Human(String name, double tall, double weight) {
		this.name = name;
		this.tall = tall;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human input = (Human) obj; // 다운캐스팅
			return name.equals(input.name) && tall == input.tall && weight == input.weight;
		} else
			return false;
	}
}
