import java.util.*;

/*
 * 도서 관리 프로그램
 * 
 * 1. 가격순으로(오름차순, 내림차순 선택가능) 전체 도서 목록 출력
 * 2. 분야를 선택해서 해당 분야만 보기
 * 3. 도서 정보 수정
 * 4. 도서 정보 추가
 * 5. 상세보기
 */

class Manage {
	Scanner sc=new Scanner(System.in);	// 스캐너
	Book[] shelf = new Book[5];			// "도서관 선반"의 역할을 하는 배열.
	
	////////////////////////////////////////
	/* 범용 메소드 */
	///////////////////////////////////////
	
	private Book select(int num) {	// 책넘버로 도서 선택
		while (num<1||num>5) {
			System.out.println("잘못된 입력입니다. 다시 입력: ");
			num=sc.nextInt();
		}
		return shelf[num-1];
	}
	
	private void printShort(Book s) {	// 도서 정보를 한 줄로 간략하게 출력
		System.out.printf(" %d | %s - %d원 \n", s.getNum(), s.getName(), s.getPrice());
	}
	
	private void printList(Book[] s) {	// 모든 도서 목록 출력
		for (Book b: s) {				// for-each문 사용
			printShort(b);
		}
	}
	
	// Book class에 toString 메소드 만들었음!
	
	
	////////////////////////////////////////
	/* 1번 메뉴: 도서 목록 열람 */
	///////////////////////////////////////
	
	
	private Book[] sortOfprice() {	// 가격높은순 배열 정렬
		Book[] sort=Arrays.copyOf(shelf, shelf.length);		// 새로 정렬한 배열을 출력하기 위한 카피배열 만듦.
		for (Book b : shelf) {								// 선택정렬 알고리즘 사용
			for(int j=0; j<sort.length-1; j++) {
				if (sort[j].getPrice() > sort[j+1].getPrice()) {	
					Book a=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=a;
				}
			}
		}
		return sort;	// 새 배열 출력
	}
	
	private Book[] sortOfpriceR() {	// 가격낮은순 배열 정렬
		Book[] sort=Arrays.copyOf(shelf, shelf.length);		// 새로 정렬한 배열을 출력하기 위한 카피배열 만듦.
		for (Book i : shelf) {								// 선택정렬 알고리즘 사용
			for(int j=0; j<sort.length-1; j++) {
				if (sort[j].getPrice() < sort[j+1].getPrice()) {  
					Book a=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=a;
				}
			}
		}
		return sort;
	}
	
	private Book[] sortOf() {		//	정렬한 배열 출력(printList 사용)
		System.out.print("1: 가격 낮은 순 / 2: 가격 높은 순 / 3: 도서번호 순  ");
		int select=sc.nextInt();
		if (select==1) {
			return sortOfprice();
		} else if (select==2) {
			return sortOfpriceR();
		} else
		System.out.println("도서번호 순 출력");
			return (shelf);
	}
	
	////////////////////////////////////////
	/* 2번 메뉴: 분야 검색  */
	///////////////////////////////////////
	
	private void searchGenre() {	// 장르 검색 출력
		System.out.println("카테고리: 장편 소설 / 시집  / 과학 공학 / 에세이");
		System.out.print("도서 분류 입력: ");
		String input=sc.next();		// String으로 입력받음
		for (Book b : shelf) {					// 도서 목록 전체를 for-each로 읽음.
			if (input.equals(b.getGenre())) 	// 입력 받은 값이 도서의 장르와 일치하면 출력.
				printShort(b);
		}
		System.out.println("출력 완료");
		sc.nextLine();
	}
	
	////////////////////////////////////////
	/* 3, 4번 메뉴: 도서 추가, 정보 수정  */
	///////////////////////////////////////
	
	private Book[] addBook() {		// 도서 추가: 기존 배열과 같지만 길이가 하나 많은 새 배열을 복사하여 만든다. 
		Book[] copy=Arrays.copyOf(shelf, shelf.length+1);
		copy[copy.length-1] = new Book(null, null, null, null, 0, copy.length);
		editBook(copy[copy.length-1]);
		System.out.println("도서 추가 완료. ");
		return copy;
	}
	
	private void editBook(Book a) {		// 책 1개의 정보 수정  
		System.out.println("단계를 건너뛰려면 0 입력");
		System.out.print("제목 입력: ");
		String input=sc.next();
		a.setName(input.equals("0") ? a.getName() : input);
		System.out.print("저자 입력: ");
		input=sc.next();
		a.setWriter(input.equals("0") ? a.getWriter() : input);
		System.out.print("분류 입력: ");
		input=sc.next();
		a.setGenre(input.equals("0") ? a.getGenre() : input);
		System.out.print("출판사 입력: ");
		input=sc.next();
		a.setPublisher(input.equals("0") ? a.getPublisher() : input);
		System.out.print("가격 입력: ");
		int select=sc.nextInt();
		a.setPrice (select==0 ? a.getPrice() : select);
		System.out.println(a);
	}
	
	////////////////////////////////////////
	/* 5번 메뉴: 도서 상세 정보 출력 */
	///////////////////////////////////////
	
	private void printBookInfo() {
	System.out.print("정보를 출력할 책 번호 입력: ");
	int select=sc.nextInt();
	System.out.println(select(select));
	}
	
	
	public void manage() {		// 동작 메소드
		shelf[0]=new Book("작별인사", "김영하", "장편 소설", "복복서가", 12600, 1);
		shelf[1]=new Book("불편한 편의점", "김호연", "장편 소설", "나무옆의자", 12600, 2);
		shelf[2]=new Book("지금 알고 있는 걸 그때도 알았더라면", "류시화", "시집", "열림원", 8000, 3);
		shelf[3]=new Book("코스모스", "칼 세이건", "과학 공학", "사이언스북스", 16650, 4);
		shelf[4]=new Book("여행의 이유 ", "김영하", "에세이", "문학동네", 12150, 5);
		
		System.out.println("========도서관리프로그램========");
		int num = 0;
		while (true) {
			
			if (num==1) {		
				System.out.println("<도서 목록 열람>");
				printList(sortOf());
				num=0;
				
			} else if (num==2) {	
				System.out.println("<분야 검색하기>");
				searchGenre();
				num=0;
				
			} else if (num==3) {		
				System.out.println("<도서 정보 수정>");
				printList(shelf);
				System.out.print("수정하려는 도서 번호 입력: ");
				int select=sc.nextInt();
				editBook(select(select));
				num=0;
				
			} else if (num==4) {	
				System.out.println("<도서 추가>");
				shelf=addBook();
				num=0;
				
			} else if (num==5) {	
				System.out.println("<도서 상세>");
				printBookInfo();
				num=0;
				
			} else if (num==9) {	
				System.out.println("프로그램을 종료하였습니다.");
				break;
				
			} else if (num==0) {	// 완료
				System.out.println("--------------------------------");
				System.out.printf("[장서 권수: %d]\n", shelf.length);
				System.out.println("1. 도서 목록 열람");
				System.out.println("2. 분야 검색하기");
				System.out.println("3. 도서 정보 수정");
				System.out.println("4. 도서 추가");
				System.out.println("5. 도서 상세");
				System.out.println();
				System.out.println("9. 프로그램 종료");
				num=sc.nextInt();
				System.out.println("--------------------------------");
				
			} else {	//완료 
				System.out.println("잘못된 입력");
				num=0;
			}
		}
	}	
}

public class Main {
	public static void main(String[] args) {
		Manage ma=new Manage();
		ma.manage();
	}
}
