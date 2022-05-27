public class ClassBox {
	// 값/상태 -> 멤버변수(member vairable) / 필드(fields)
	int length;
	int width;
	int height;
	
	public void printAllState() {
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
	}
	
	public int getVol() {
		return width*length*height;
	}
}


//왜 Static이 없을까?