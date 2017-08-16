package demo2;

import java.util.ArrayList;
import java.util.List;

import pojo.User;

public class Client2 {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("苏国庆", 23));
		userList.add(new User("国庆牛", 23));
		userList.add(new User("张国庆三", 23));
		userList.add(new User("苏国", 23));
		IUserProvider iUserProvider = new UserProvider(userList);

		System.out.println(iUserProvider.findUser(new UserNameLike("%国庆%")));
	}
}
