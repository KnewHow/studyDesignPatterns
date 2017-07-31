package commandPattern;

public class Client {
	public static void main(String[] args) {
		AbstractCmd abstractCmd = new ZipCompressCmd();
		Invoker invoker = new Invoker(abstractCmd);
		invoker.execute("1", "2");
	}
}
