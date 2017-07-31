package strategyPattern;

public class Client {
	public static void main(String[] args) {
		Zip zip = new Zip();
		Context context = new Context(zip);
		context.compress("1", "2");
	}
}
