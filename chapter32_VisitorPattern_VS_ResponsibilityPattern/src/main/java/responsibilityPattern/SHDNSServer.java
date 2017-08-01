package responsibilityPattern;

public class SHDNSServer extends DNSServer {

	@Override
	protected boolean isLocal(String domain) {
		return domain.endsWith(".sh.cn");
	}

	@Override
	protected Recorder echo(String domain) {
		Recorder recorder = super.echo(domain);
		recorder.setOwner("上海DNS服务");
		return recorder;
	}

}
