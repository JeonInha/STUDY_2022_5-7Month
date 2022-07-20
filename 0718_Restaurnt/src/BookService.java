import java.sql.Connection;
import java.sql.SQLException;

import ko.co.greenart.dbutil.DBUtil;

public class BookService {
	private BookDaoParamConn dao;

	public BookService(BookDaoParamConn dao) {
		super();
		this.dao = dao;
	}

	public void setDao(BookDaoParamConn dao) {
		this.dao = dao;
	}
	
	// 신간이 추가되면 비슷한 이름 책 할인
	public void insertAndUpdate(String title, int bookid, int price) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);
			dao.update(conn, bookid, "%"+title+"%", price);
			dao.insert(conn, title, price);
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DBUtil.closeConn(conn);
		}
	}
	
	
	
	
	
	
}