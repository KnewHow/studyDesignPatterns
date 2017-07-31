package factoryPattern;

public class Client {
	public static void main(String[] args) {
		ISuperMan superMan = SuperManFactory.createSuperMan("adult");
		superMan.specialTalent();
		superMan = SuperManFactory.createSuperMan("child");
		superMan.specialTalent();
	}
}
