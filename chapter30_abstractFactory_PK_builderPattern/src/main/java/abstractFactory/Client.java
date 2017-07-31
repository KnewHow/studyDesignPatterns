package abstractFactory;

public class Client {
	public static void main(String[] args) {
		CarFactory carFactory = new BenzFactory();
		carFactory.createSuv();
	}
}
