package chapter28_day01.sum;

public class Flyweight {
	private String intrinsic;

	protected final String extrinsic;

	public Flyweight(String extrinsic) {
		super();
		this.extrinsic = extrinsic;
	}

	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}

}
