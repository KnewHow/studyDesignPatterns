package abstractFactory;

public class BenzVan extends AbsBMW {
	private final static String R_SEARIES = "R系列商务车";

	@Override
	public String getModel() {
		return R_SEARIES;
	}

}
