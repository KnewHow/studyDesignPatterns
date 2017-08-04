package strategyPattern;

public class Client {
	public static void main(String[] args) {
		Context context = new Context(new TextMail("12", "12", "1"));
		context.sendMail();
	}
}
