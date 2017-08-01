package visitorPattern;

public class Client {
	public static void main(String[] args) {
		DNSServer sh = new SHDNSServer();
		DNSServer china = new ChinaDNSServer();
		DNSServer top = new TopDNSServer();
		china.setUpperServer(top);
		sh.setUpperServer(china);
		Recorder recorder = new Recorder();
		recorder.setDomain("www.xxx.com");
		sh.update(null, recorder);
		System.out.println(recorder.toString());
	}
}
