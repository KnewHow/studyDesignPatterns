package builderPattern;

public abstract class CarBuilder {

	private Blueprint blueprint;

	public Car buildCar() {
		return new Car(buildEngine(), buildEngine());
	}

	public void setBlueprint(Blueprint blueprint) {
		this.blueprint = blueprint;
	}

	protected Blueprint getBlueprint() {
		return this.blueprint;
	}

	protected abstract String buildWheel();

	protected abstract String buildEngine();
}
