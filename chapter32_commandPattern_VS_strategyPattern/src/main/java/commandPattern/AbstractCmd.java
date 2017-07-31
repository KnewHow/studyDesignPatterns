package commandPattern;

public abstract class AbstractCmd {
	IReceiver zipReceiver = new ZipReceiver();
	
	IReceiver gzipReciver = new  GzipReceiver();
	
	public abstract boolean execute(String source, String to);
}
