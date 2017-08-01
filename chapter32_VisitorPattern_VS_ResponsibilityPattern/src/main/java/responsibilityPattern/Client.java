package responsibilityPattern;

public class Client {
	public static void main(String[] args) {
		DNSServer sh = new SHDNSServer();
		DNSServer china = new ChinaDNSServer();
		DNSServer top = new TopDNSServer();
		sh.setUpperServer(china);
		china.setUpperServer(top);
//		Recorder recorder = sh.resolve("www.xxx.sh.cn");
//		Recorder recorder = sh.resolve("www.xxx.com.cn");
		Recorder recorder = sh.resolve("www.xxx.com");
		System.out.println(recorder.toString());
	}
}
