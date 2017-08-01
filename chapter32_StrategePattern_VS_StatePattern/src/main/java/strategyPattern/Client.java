package strategyPattern;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setAlgorithm(new ChildWork());
		context.work();
		context.setAlgorithm(new AdultWork());
		context.work();
	}
}
