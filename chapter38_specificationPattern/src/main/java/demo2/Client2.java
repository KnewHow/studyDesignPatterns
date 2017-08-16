package demo2;

import java.util.ArrayList;
import java.util.List;

import pojo.User;

public class Client2 {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("�չ���", 23));
		userList.add(new User("����ţ", 23));
		userList.add(new User("�Ź�����", 23));
		userList.add(new User("�չ�", 23));
		IUserProvider iUserProvider = new UserProvider(userList);

		System.out.println(iUserProvider.findUser(new UserNameLike("%����%")));
	}
}
