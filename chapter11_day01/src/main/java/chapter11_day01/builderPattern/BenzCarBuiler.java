package chapter11_day01.builderPattern;

import java.util.List;

public class BenzCarBuiler extends CarBuilder {

	private BenzModel benz = new BenzModel();

	@Override
	public void setSequence(List<String> sequence) {
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
