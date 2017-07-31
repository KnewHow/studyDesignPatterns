package commandPattern;

public class GzipCompressCmd extends AbstractCmd {

	@Override
	public boolean execute(String source, String to) {
		return super.gzipReciver.compress(source, to);
	}

}
