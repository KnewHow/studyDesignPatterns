package visitorPattern;

public class TopDNSServer extends DNSServer {

	@Override
	protected boolean isLocal(Recorder recorder) {
		return true;
	}

	@Override
	protected void sign(Recorder recorder) {
		recorder.setOwner("世界顶级DNS服务器");
	}

}
