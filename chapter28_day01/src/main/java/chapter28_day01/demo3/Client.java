package chapter28_day01.demo3;

public class Client {
	public static void main(String[] args) {
		SignInfoFactory.getSignInfo("科目1");
		SignInfoFactory.getSignInfo("科目2");
		SignInfoFactory.getSignInfo("科目3");
		SignInfoFactory.getSignInfo("科目4");
		SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");
		while (true) {
			signInfo.setId("ZhangSan");
			signInfo.setLocation("ZhangSan");
			(new MultiThread(signInfo)).start();
			signInfo.setId("LiSI");
			signInfo.setLocation("LiSI");
			(new MultiThread(signInfo)).start();
		}
	}
}
