package bridgePattern;

public abstract class MailServer {
	protected final MailTemplate mailTemplate;

	public MailServer(MailTemplate mailTemplate) {
		super();
		this.mailTemplate = mailTemplate;
	}

	public void sendMail() {
		System.out.println(this.mailTemplate.getFrom() + this.mailTemplate.getName());
	}

}
