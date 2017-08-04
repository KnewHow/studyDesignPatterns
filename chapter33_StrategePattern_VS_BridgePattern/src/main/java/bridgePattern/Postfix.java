package bridgePattern;

public class Postfix extends MailServer{

	public Postfix(MailTemplate mailTemplate) {
		super(mailTemplate);
	}

	@Override
	public void sendMail() {
		super.sendMail();
		System.out.println("use Postfix");
	}
	

}
