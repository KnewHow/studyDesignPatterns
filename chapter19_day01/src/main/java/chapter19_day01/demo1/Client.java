package chapter19_day01.demo1;

import chapter19_day01.demo1.desigin_one.IUserInfo;
import chapter19_day01.demo1.desigin_one.UserInfo;

public class Client {
	public static void main(String[] args) {
//		funInDesigin();
		funOuterDesigin();
	}

	public static void funInDesigin() {
		IUserInfo userInfo = new UserInfo();
		for (int i = 0; i < 100; i++) {
			userInfo.getMobileNumber();
		}
	}
	
	public static void funOuterDesigin() {
		IUserInfo userInfo = new OuterUserInfo();
		for (int i = 0; i < 100; i++) {
			userInfo.getMobileNumber();
		}
	}
}
