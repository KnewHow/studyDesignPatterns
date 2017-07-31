package strategyPattern;

public class Zip implements Algorithm {

	@Override
	public boolean compress(String source, String to) {
		System.out.println(source + " ----> " + to + " zip success");
		return true;
	}

	@Override
	public boolean uncompress(String source, String to) {
		System.out.println(source + " ----> " + to + " un zip success");
		return true;
	}

}
