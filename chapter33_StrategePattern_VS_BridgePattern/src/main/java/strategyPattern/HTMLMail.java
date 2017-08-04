package strategyPattern;

public class HTMLMail extends MailTemplate {

	public HTMLMail(String from, String name, String subject) {
		super(from, name, subject);
	}

	@Override
	public String getContext() {
		String context = "HTML邮件" + super.getContext();
		return context;
	}

}
