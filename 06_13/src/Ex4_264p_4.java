class Book {
	private String name;
	private int pagenum;
	private String writer;
	
	public Book(String name, int pagenum, String writer) {
		this.name = name;
		this.pagenum = pagenum;
		this.writer = writer;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPagenum() {
		return pagenum;
	}
	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
}

class Magazine extends Book {
	private String pubDate;

	public Magazine(String name, int pagenum, String writer, String pubDate) {
		super(name, pagenum, writer);
		this.pubDate = pubDate;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
}

public class Ex4_264p_4 {
	public void printAll(Magazine a) {
		System.out.println("잡지명: "+a.getName());
		System.out.println("페이지수: "+a.getPagenum());
		System.out.println("저자: "+a.getWriter());
		System.out.println("출간일: "+a.getPubDate());
	}
	public static void main(String[] args) {
		Magazine a=new Magazine("1st looks", 50, "unknown", "0530");
		Ex4_264p_4 b=new Ex4_264p_4();
		b.printAll(a);

	}

}
