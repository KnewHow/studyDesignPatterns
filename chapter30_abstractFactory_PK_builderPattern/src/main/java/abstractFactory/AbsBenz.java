package abstractFactory;

public abstract class AbsBenz implements ICar {

	private final static String BMW_BAND = "奔驰汽车";

	@Override
	public String getBand() {
		return BMW_BAND;
	}
}
