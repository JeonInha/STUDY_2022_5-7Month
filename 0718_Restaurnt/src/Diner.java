
public class Diner {
	
	private int id;
	private String name;
	private String tel;
	private String adress;
	
	public Diner(int id, String name, String tel, String adress) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.adress = adress;
	}
	
	public Diner(String name, String tel, String adress) {
		this.name = name;
		this.tel = tel;
		this.adress = adress;
	}
	
	@Override
	public String toString() {
		return String.format("%d\t%s\t\t%s\t%s", id, name, tel, adress);
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
}
