package commandPattern;

public class ZipUncompressCmd extends AbstractCmd {

	@Override
	public boolean execute(String source, String to) {
		return super.zipReceiver.uncompress(source, to);
	}

}
