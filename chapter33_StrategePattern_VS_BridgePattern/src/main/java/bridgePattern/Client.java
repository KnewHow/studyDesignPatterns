package bridgePattern;

public class Client {
	public static void main(String[] args) {
		MailTemplate mail = new TextMail("1233", "23", "12");
		MailServer server = new Postfix(mail);
		server.sendMail();
		server = new SendMail(mail);
		server.sendMail();
	}
}
