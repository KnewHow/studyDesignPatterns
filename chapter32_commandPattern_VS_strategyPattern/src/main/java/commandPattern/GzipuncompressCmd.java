package commandPattern;

public class GzipuncompressCmd extends AbstractCmd {

	@Override
	public boolean execute(String source, String to) {
		return super.gzipReciver.uncompress(source, to);
	}

}
