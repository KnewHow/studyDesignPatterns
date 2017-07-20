package chapter13_day01.demo1;

import java.util.Random;

public class Client {
	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		Mail mail = new Mail(new AdvTemplate());
		int i = 0;
		mail.setTail("XX银行版权所有");
		while (i < MAX_COUNT) {
			mail.setAppellation(getRandString(5) + " 先生(女士) ");
			mail.setReceiver(getRandString(5) + "@" + getRandString(8));
			sendMain(mail);
			i++;
		}
	}

	public static void sendMain(Mail mail) {
		System.out.println("标题：" + mail.getSubject() + "\t收件人:" + mail.getReceiver() + "\t...发送成功！");
	}

	public static String getRandString(int maxLength) {
		String source = "abcdefABCDEF";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}
}
