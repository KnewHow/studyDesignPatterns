package strategyPattern;

/**
 * A abstract class of mail template
 * 
 * @author ygh Aug 4, 2017
 */
public abstract class MailTemplate {
	private String from;

	private String name;

	private String subject;

	private String context;

	public MailTemplate(String from, String name, String subject) {
		super();
		this.from = from;
		this.name = name;
		this.subject = subject;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}


}
