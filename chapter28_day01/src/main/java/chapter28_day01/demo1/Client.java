package chapter28_day01.demo1;

import chapter28_day01.demo1.SignInfoFactory;

public class Client {
	public static void main(String[] args) {
		SignInfo info = SignInfoFactory.getSignInfo();
		info.setId("123");
	}
}
