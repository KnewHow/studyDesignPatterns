package bridgePattern;

public class SendMail extends MailServer {

	public SendMail(MailTemplate mailTemplate) {
		super(mailTemplate);
	}

	@Override
	public void sendMail() {
		super.sendMail();
		System.out.println("use sendMail");
	}

}
