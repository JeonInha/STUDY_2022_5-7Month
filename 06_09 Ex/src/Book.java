public class Book {
	
	private String name;		// 서명
	private String writer;		// 저자
	private String genre;		// 분류
	private String publisher;	// 출판사
	private int price;			// 가격
	private int num;			// 도서번호
	
	public String toString() {	// 객체의 상태를 문자열로 반환
		String result = String.format("    제목: %s\n    저자: %s\n    분류: %s\n    출판사: %s\n    가격: %d원\n", name, writer, genre, publisher, price);
		return result;
	}
	
	public Book(String name, String writer, String genre, String publisher, int price, int num) {
		this.name = name;
		this.writer = writer;
		this.genre = genre;
		this.publisher = publisher;
		this.price = price;
		this.num = num;
	}
	
	// 이하 아래에는 getter-setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
