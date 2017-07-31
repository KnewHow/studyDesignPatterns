package builderPattern;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		director.createBenzSuv();
		director.createComplex();
	}
}
