class Food {
	private int kcal;
	private int price;
	private int weight;
	
	public Food(int kcal, int price, int weight) {
		super();
		this.kcal = kcal;
		this.price = price;
		this.weight = weight;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}

class Melon extends Food {
	private String farmInfo;

	public Melon(int kcal, int price, int weight, String farmInfo) {
		super(kcal, price, weight);
		this.farmInfo = farmInfo;
	}

	public String getFarmInfo() {
		return farmInfo;
	}

	public void setFarmInfo(String farmInfo) {
		this.farmInfo = farmInfo;
	}
}
public class Ex4_264p_5 {
	
	public void printAll(Melon a) {
		System.out.println("칼로리: "+a.getKcal());
		System.out.println("가격: "+a.getPrice());
		System.out.println("무게: "+a.getWeight());
		System.out.println("출원농원정보: "+a.getFarmInfo());
	}
	public static void main(String[] args) {
		Ex4_264p_5 a=new Ex4_264p_5();
		Melon m=new Melon(10, 10, 10, "행복농장");
		
		a.printAll(m);
	}
}
