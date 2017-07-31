package strategyPattern;

public class Gzip implements Algorithm {

	@Override
	public boolean compress(String source, String to) {
		System.out.println(source + " ----> " +to+ " gzip success");
		return true;
	}

	@Override
	public boolean uncompress(String source, String to) {
		System.out.println(source + " ----> " +to+ " un gzip success");
		return true;
	}

}
