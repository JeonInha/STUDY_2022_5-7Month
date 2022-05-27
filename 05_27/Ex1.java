class Book {
	String title;
	String author;
	public void printAll() {
		System.out.printf("제목: %s\n저자: %s\n", title, author);
	}
}

class Day {
	int year;
	int month;
	int day;
	public void printKOver() {
		System.out.printf("%d - %d - %d\n", year, month, day);
	}
	public void printUSAver() {
		System.out.printf("%d / %d / %d\n", month, day, year);
	}
}

class Movie {
	String title;
	double score;
	String director;
	int pubyear;
	
	public void printAll() {
		System.out.println("제목: "+title);
		System.out.println("평점: "+score);
		System.out.println("감독: "+director);
		System.out.println("발표연도: "+pubyear);
	}
}
public class Ex1 {
	public static void main(String[] args) {
		
		Book littlePrince=new Book();
		littlePrince.title="어린 왕자";
		littlePrince.author="생택쥐페리";
		littlePrince.printAll();
		System.out.println("*********************");
		
		Day today=new Day();
		today.year=2022;
		today.month=05;
		today.day=27;
		today.printUSAver();
		today.printKOver();
		System.out.println("*********************");
		
		Movie hp=new Movie();
		hp.title="해리 포터와 마법사의 돌";
		hp.score=8.3;
		hp.director="누군지 기억안나는데 암튼 작가는 조앤롤링";
		hp.pubyear=2001;
		hp.printAll();
		System.out.println("*********************");
		
	}
}