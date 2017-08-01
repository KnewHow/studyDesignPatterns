package responsibilityPattern;

import java.util.Random;

public abstract class DNSServer {
	/**
	 * The upper server
	 */
	private DNSServer upperServer;

	/**
	 * resolve domain and return recorder
	 * 
	 * @param domain
	 *            The string of the domain
	 * @return The resolving recorder
	 */
	public final Recorder resolve(String domain) {
		Recorder recorder = null;
		if (isLocal(domain)) {
			recorder = echo(domain);

		} else {
			recorder = this.upperServer.resolve(domain);
		}
		return recorder;
	}

	/**
	 * Whether domain the DNS can parse
	 * 
	 * @param domain
	 *            The string of the domain
	 * @return true will be return if the domain can be parsed, otherwise return
	 *         flase
	 */
	protected abstract boolean isLocal(String domain);

	protected Recorder echo(String domain) {
		Recorder recorder = new Recorder();
		recorder.setIp(getIPAddress());
		recorder.setDomain(domain);
		return recorder;

	}

	private String getIPAddress() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			if (i < 3) {
				sb.append(random.nextInt(255) + ".");
			} else {
				sb.append(random.nextInt(255));
			}
		}
		return sb.toString();
	}

	public DNSServer getUpperServer() {
		return upperServer;
	}

	public void setUpperServer(DNSServer upperServer) {
		this.upperServer = upperServer;
	}

}
