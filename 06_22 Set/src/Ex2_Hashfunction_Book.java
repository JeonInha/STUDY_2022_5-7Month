import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

// 정렬 트리셋을 가지고싶으면 comparable 구현해야함
class Book implements Comparable<Book> {
	private String title;
	private int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		return Objects.hash(title, price);	
		// title과 price가 같으면 같은 값의 hash코드를 넣어줌
	}
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
	
	// 이클립스가 자동으로 만들어줌 짱
	
	
}
public class Ex2_Hashfunction_Book {
	public static void main(String[] args) {
		Book b1 = new Book("책1", 5000);
		Book b2 = new Book("책2", 6000);
		Book b3 = new Book("책3", 7000);
		Book b4 = new Book("책1", 5000);
		
		Set<Book> set = new HashSet<>();
		// hash: 각 객체마다 고유하게 가지고 있는 숫자값
		// set에서 원소가 같은지 판단하는 기준: hash값
		// 그래서 b1과 b4가 같음에도 hash가 달라 ,,
		// hashcode 메소드를 override하면 1차적으로 hashcode가 같다 하여 
		// 그 다음으로 equals로 판단
		set.add(b1);	
		set.add(b2);
		set.add(b3);
		set.add(b4);
		
		System.out.println(set.size());
		System.out.println(set);
		
		Set<Book> tree = new TreeSet<>(set);
		System.out.println(tree);	// 자동정렬
		
		Comparator<Book> judgePrice = new Comparator<Book>(){
			public int compare(Book o1, Book o2) {
				return o1.getPrice()-o2.getPrice();
			}
		};
		

	}

}
