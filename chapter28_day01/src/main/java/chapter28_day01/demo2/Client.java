package chapter28_day01.demo2;

public class Client {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			String subject = "科目" + i;
			for (int j = 0; j < 30; j++) {
				String key = subject + "考试地点" + j;
				SignInfoFactory.getSignInfo(key);
			}
		}
		SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
		/**
		 * multiply thread test,it will produce thread safe
		 */
		while (true) {
			signInfo.setId("ygh");
			signInfo.setPostAddress("ygh");
			(new MultiThread(signInfo)).start();

			signInfo.setId("lala");
			signInfo.setPostAddress("lala");
			(new MultiThread(signInfo)).start();
		}
	}
}
