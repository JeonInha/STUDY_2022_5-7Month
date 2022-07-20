import java.sql.SQLException;
import java.util.List;

public class TestRepo {
	public static void main(String[] args) {
		BooksRepository repo = new BooksRepository();
		
		int result;
		try {
//			result = repo.add(new Book("�뀒�뒪�듃�슜 梨�123", 55000));
//			System.out.println("異붽� �솗�씤 : " + (result == 1));
			
//			List<Book> list = repo.list();
//			System.out.println(list);
			
//			Book book = repo.selectByTitle("asdf");
//			System.out.println(book);
			
			result = repo.update(new Book(10, "책이름", 5000));
			System.out.println(result == 1);
			
			Book book = repo.selectByTitle("책이름");
			System.out.println(book);
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
		}
	}
}
