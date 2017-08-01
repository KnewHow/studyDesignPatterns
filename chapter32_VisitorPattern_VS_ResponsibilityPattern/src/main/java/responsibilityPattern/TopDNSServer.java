package responsibilityPattern;

public class TopDNSServer extends DNSServer {

	@Override
	protected boolean isLocal(String domain) {
		return true;
	}

	@Override
	protected Recorder echo(String domain) {
		Recorder recorder = super.echo(domain);
		recorder.setOwner("世界顶级DNS服务");
		return recorder;
	}

}
