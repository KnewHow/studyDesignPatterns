package buildPattern;

public class Client {
	public static void main(String[] args) {
		SuperMan adSuperMan = Director.getAdultSuperMan();
		adSuperMan.getBody();
	}
}
