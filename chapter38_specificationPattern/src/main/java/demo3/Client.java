package demo3;

import java.util.ArrayList;
import java.util.List;

import pojo.User;

public class Client {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("苏国庆", 23));
		userList.add(new User("国庆牛", 82));
		userList.add(new User("张国庆三", 30));
		userList.add(new User("苏国", 90));
		IUserProvider iUserProvider = new UserProvider(userList);
		IUserSpecification spec1 = new UserNameLike("%国庆%");
		IUserSpecification spec2 = new UserByAgeThan(25);
		System.out.println(iUserProvider.findUser(spec1.and(spec2)));
	}
}
