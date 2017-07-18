package chapter11_day01.builderPattern;

import java.util.List;

public abstract class CarBuilder {
	public abstract void setSequence(List<String> sequence);

	public abstract CarModel getCarModel();
}
