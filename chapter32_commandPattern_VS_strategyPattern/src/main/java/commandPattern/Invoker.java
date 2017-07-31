package commandPattern;

public class Invoker {
	private AbstractCmd abstractCmd;

	public Invoker(AbstractCmd abstractCmd) {
		super();
		this.abstractCmd = abstractCmd;
	}

	public boolean execute(String source, String to) {
		return this.abstractCmd.execute(source, to);
	}
}
