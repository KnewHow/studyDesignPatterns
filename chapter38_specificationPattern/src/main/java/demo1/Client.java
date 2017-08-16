package demo1;

import java.util.ArrayList;
import java.util.List;

import pojo.User;

public class Client {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("苏大",3));
		userList.add(new User("牛二",8));
		userList.add(new User("张三",10));
		userList.add(new User("李四",15));
		userList.add(new User("王五",18));
		userList.add(new User("赵六",20));
		userList.add(new User("马七",25));
		userList.add(new User("杨八",30));
		userList.add(new User("候九",35));
		userList.add(new User("布十",40));
		
		IUserProvider iUserProvider = new UserProvider(userList);
		System.out.println(iUserProvider.findUserByAgeThan(20));
	}
}
