package strategyPattern;

public class TextMail extends MailTemplate {

	public TextMail(String from, String name, String subject) {
		super(from, name, subject);
	}

	@Override
	public String getContext() {
		String context = "文本邮件" + super.getContext();
		return context;
	}

}
