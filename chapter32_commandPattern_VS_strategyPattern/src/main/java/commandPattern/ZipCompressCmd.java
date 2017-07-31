package commandPattern;

public class ZipCompressCmd extends AbstractCmd {

	@Override
	public boolean execute(String source, String to) {
		return super.zipReceiver.compress(source, to);
	}

}
