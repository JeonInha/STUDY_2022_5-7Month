public class Staff {
	private String name;
	private String role;
	
	public Staff(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Staff) {
			Staff o= (Staff) obj;
			return (this.getName().equals(o.getName())&&this.getRole().equals(o.getRole()));
		} else return false;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s", name, role);
	}
}

class Tamer extends Staff implements Itamable {
	Animal[] tamedAnimal;
	
	public Tamer(String name, String role) {
		super(name, role);
	}

	public void setTamedAnimal(Animal[] tamedAnimal) {
		this.tamedAnimal = tamedAnimal;
	}

	public Animal[] getTamedAnimal() {
		return tamedAnimal;
	}
}
