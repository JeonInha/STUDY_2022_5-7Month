public class Constructor {
	int width;
	int length;
	int height;
	
	public Constructor(int w, int l, int h) {
		width=w;
		length=l;
		height=h;
	}
		// 생성자를 지정하는 순간 기본생성자로 필드 초기화는 할 수 없음.
		
	public Constructor() {
	width=0;
	length=0;
	height=0;
		// 명시적 기본생성자를 생성해주면 기본생성자를 쓸 수 있음.
	}
	
	public static void main(String[] args) {
		
		Constructor box=new Constructor(40, 40, 40);
		System.out.println(box.width);
		System.out.println(box.length);
		System.out.println(box.height);
		
		Constructor b2=new Constructor();
		
		
	}
}