package chapter19_day01.demo2;

import chapter19_day01.demo2.design_one.IUserInfo;
import chapter19_day01.demo2.design_one.UserInfo;
import chapter19_day01.demo2.design_two.IOuterUserBaseInfo;
import chapter19_day01.demo2.design_two.IOuterUserHomeInfo;
import chapter19_day01.demo2.design_two.IOuterUserOfficeInfo;
import chapter19_day01.demo2.design_two.OuterUserBaseInfo;
import chapter19_day01.demo2.design_two.OuterUserHomeInfo;
import chapter19_day01.demo2.design_two.OuterUserOfficeInfo;

public class Client {
	public static void main(String[] args) {
		funInDesigin();
//		funOuterDesigin();
	}

	public static void funInDesigin() {
		IUserInfo userInfo = new UserInfo();
		for (int i = 0; i < 100; i++) {
			userInfo.getMobileNumber();
		}
	}

	public static void funOuterDesigin() {
		IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
		IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
		IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
		IUserInfo userInfo = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
		for (int i = 0; i < 100; i++) {
			userInfo.getMobileNumber();
		}
	}
}
