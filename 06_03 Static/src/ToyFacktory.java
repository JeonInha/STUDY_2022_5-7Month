public class ToyFacktory {
	private String location;
	
	public static Toy makeToy() {
		return new Toy("처키 인형, 생산지: "+location, 10000);
	}
}
