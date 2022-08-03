package signUp;

import java.util.List;

public interface AccManagerDao {
	
	//// 목표!!!! 알림창 만들기!!!!!!
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
