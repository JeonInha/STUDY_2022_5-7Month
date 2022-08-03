package signUp;

import java.util.List;

public interface AccManagerDao {
	
	//// ��ǥ!!!! �˸�â �����!!!!!!
	//c
	int createNewAccount(Account user);
	
	//r
	Account readAccount(int id);
	Account readAccount(String name);
	List<Account> readAllAccount();
	
	//u
	int updateFollowing(Account user);
	int updateFollower(Account user);
	
	//d
	int deleteAccount(Account user);
	
}
