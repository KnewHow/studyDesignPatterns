package abstractFactory;

public class BenzSuv extends AbsBMW {
	private final static String SEVENT_SEARIES = "X系列车型SUV";

	@Override
	public String getModel() {
		return SEVENT_SEARIES;
	}

}
