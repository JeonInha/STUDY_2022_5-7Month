abstract class Animal {
	private String name;
	private String species;
	private int taste;
	private int age;
	private double weight;
	private String etc;
	
	public Animal(String name, String species, int age, double weight) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getTaste() {
		return taste;
	}

	public void setTaste(int taste) {
		this.taste = taste;
	}
	
	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%d\t%.2f\t%s", species, name, age, weight, etc);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Animal) {
			Animal a = (Animal) obj;
			return (this.getName().equals(a.getName())&&this.getSpecies().equals(a.getSpecies()));
		} else 
			return false;
	}
}

class EatMeatAnimal extends Animal {
	public EatMeatAnimal(String name, String species, int age, double weight) {
		super(name, species, age, weight);
		setTaste(IEatAble.EATMEAT);
	}
}

class EatGrassAnimal extends Animal {
	public EatGrassAnimal(String name, String species, int age, double weight) {
		super(name, species, age, weight);
		setTaste(IEatAble.EATGRASS);
	}
}

class EatAllAnimal extends Animal {
	public EatAllAnimal(String name, String species, int age, double weight) {
		super(name, species, age, weight);
		setTaste(IEatAble.EATALL);
	}
}
