package builderPattern;

public class Car implements ICar{
	
	private String engine;
	
	private String wheel;
	
	

	public Car(String engine, String wheel) {
		super();
		this.engine = engine;
		this.wheel = wheel;
	}

	@Override
	public String getWheel() {
		return this.wheel;
	}

	@Override
	public String getEngine() {
		return this.engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", wheel=" + wheel + "]";
	}
	
	

}
