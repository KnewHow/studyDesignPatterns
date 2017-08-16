package demo3;

import java.util.ArrayList;
import java.util.List;

import pojo.User;

public class Client {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("�չ���", 23));
		userList.add(new User("����ţ", 82));
		userList.add(new User("�Ź�����", 30));
		userList.add(new User("�չ�", 90));
		IUserProvider iUserProvider = new UserProvider(userList);
		IUserSpecification spec1 = new UserNameLike("%����%");
		IUserSpecification spec2 = new UserByAgeThan(25);
		System.out.println(iUserProvider.findUser(spec1.and(spec2)));
	}
}
