import java.util.Arrays;

class Book {	
	String name;		// 서명
	String writer;		// 저자
	String genre;		// 분류
	 String publisher;	// 출판사
	int price;			// 가격
	int num;			// 도서번호
	
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
}

public class LineUp1 {
	public static void main(String[] args) {
		Book[] shelf = new Book[5];
		shelf[0] = new Book("작별인사", "김영하", "장편 소설", "복복서가", 12600, 1);
		shelf[1] = new Book("불편한 편의점", "김호연", "장편 소설", "나무옆의자", 12600, 2);
		shelf[2] = new Book("지금 알고 있는 걸 그때도 알았더라면", "류시화", "시집", "열림원", 8000, 3);
		shelf[3] = new Book("코스모스", "칼 세이건", "과학 공학", "사이언스북스", 16650, 4);
		shelf[4] = new Book("여행의 이유 ", "김영하", "에세이", "문학동네", 12150, 5);
		int[] arr = {50, 30, 20, 60, 10};
		
		Arrays.sort(arr);	// 원시형 데이터를 가진 배열 정렬 메소드
		// 혹은 정렬 알고리즘을 위키에서 검색해서 쓰기.
		int index = Arrays.binarySearch(arr, 20);
		System.out.println("20의 인덱스: "+index);
		
		System.out.println(Arrays.toString(arr));
		
		// 참조형 데이터를 가진 배열을 Array.sort()로 정렬할 땐 기준이 없어 런타임에러가 남.
	}
		
		

}
