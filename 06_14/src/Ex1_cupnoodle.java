// 컵라면의 제조사, 이름, 가격
class CupNoodle {
	private String name;
	private String company;
	private int price;
	
	public CupNoodle(String name, String company, int price) {
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CupNoodle) {
			CupNoodle other = (CupNoodle) obj;
			if (name.equals(other.name)&&company.equals(other.company))
				return true;
			else 
				return false;
		} else 
			return false;
	}
	
	@Override
	public String toString() {
		return String.format("(이름: %s, 제조사: %s, 가격: %d)", name, company, price);
	}
}

public class Ex1_cupnoodle {
	public static void main(String[] args) {
		CupNoodle a=new CupNoodle("진라면", "오뚜기", 700);
		CupNoodle b=new CupNoodle("신라면", "오뚜기", 950);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.equals(b));
	}
}
