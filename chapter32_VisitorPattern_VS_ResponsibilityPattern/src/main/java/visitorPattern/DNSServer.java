package visitorPattern;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * Abstract DNS Server
 * 
 * @author ygh Aug 1, 2017
 */
public abstract class DNSServer extends Observable implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Recorder recorder = (Recorder) arg;
		if (isLocal(recorder)) {
			recorder.setIp(getIPAddress());
		} else {
			responseFromUpperServer(recorder);
		}
		sign(recorder);
	}

	public void setUpperServer(DNSServer dnsServer) {
		super.deleteObservers();
		super.addObserver(dnsServer);
	}

	private void responseFromUpperServer(Recorder recorder) {
		super.setChanged();
		super.notifyObservers(recorder);
	}

	/**
	 * Whether domain the DNS can parse
	 * 
	 * @param domain
	 *            The string of the domain
	 * @return true will be return if the domain can be parsed, otherwise return
	 *         flase
	 */
	protected abstract boolean isLocal(Recorder recorder);

	/**
	 * Set server logo
	 * 
	 * @param recorder
	 */
	protected abstract void sign(Recorder recorder);

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

}
