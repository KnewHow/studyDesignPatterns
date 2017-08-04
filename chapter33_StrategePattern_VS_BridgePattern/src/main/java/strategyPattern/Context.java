package strategyPattern;

public class Context {
	private MailTemplate mailTemplate;

	public Context(MailTemplate mailTemplate) {
		super();
		this.mailTemplate = mailTemplate;
	}

	public MailTemplate getMailTemplate() {
		return mailTemplate;
	}

	public void setMailTemplate(MailTemplate mailTemplate) {
		this.mailTemplate = mailTemplate;
	}

	public void sendMail() {
		System.out.println(mailTemplate.getContext());
	}
}
