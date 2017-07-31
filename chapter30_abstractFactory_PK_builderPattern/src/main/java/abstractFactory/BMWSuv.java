package abstractFactory;

public class BMWSuv extends AbsBenz {
	private final static String G_SEARIES = "G系列车型SUV";

	@Override
	public String getModel() {
		return G_SEARIES;
	}

}
