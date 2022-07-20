import java.sql.SQLException;
import java.util.List;

public interface DinerDao {
	int create(String name, String phoneNumber, String address) throws SQLException;
	
	List<Diner> read() throws SQLException;
	Diner read(int id) throws SQLException;
	
	int update(int id, String name, String phoneNumber, String address) throws SQLException;
	
	int delete(int id) throws SQLException;
}