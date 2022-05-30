public class Chair {
	String mk;
	int mdd;
	int mdm;
	int mdy;
	int price;
	String name;
	
	public Chair() {
		mk="a사";
		mdd=00;
		mdm=00;
		mdy=0000;
		price=0;
		name="unknown";
	}
	
	public Chair(String k, String n, int d, int m, int y, int p) {
		mk=k;
		mdd=d;
		mdm=m;
		mdy=y;
		price=p;
		name=n;
	}
	
	public void printAll() {
		System.out.println("제조사: "+mk);
		System.out.println("제품명: "+name);
		System.out.printf("제조년월: %d-%02d-%02d\n", mdy, mdm, mdd);
		System.out.println("가격: "+price);
	}
	
	public static void main(String[] args) {
		
		Chair chair=new Chair("시디즈", "T50", 5, 9, 2016, 374000);
		chair.printAll();
		
		Chair chair2=new Chair("허먼밀러", "뉴 에어론", 21, 10, 2019, 2120000);
		chair2.printAll();
		
		
		
		
	}
	
}