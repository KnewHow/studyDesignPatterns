package demo1;

import java.util.ArrayList;
import java.util.List;

import pojo.User;

public class Client {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("�մ�",3));
		userList.add(new User("ţ��",8));
		userList.add(new User("����",10));
		userList.add(new User("����",15));
		userList.add(new User("����",18));
		userList.add(new User("����",20));
		userList.add(new User("����",25));
		userList.add(new User("���",30));
		userList.add(new User("���",35));
		userList.add(new User("��ʮ",40));
		
		IUserProvider iUserProvider = new UserProvider(userList);
		System.out.println(iUserProvider.findUserByAgeThan(20));
	}
}
