package chapter11_day01.builderPattern;

import java.util.List;

public class BMWCarBuiler extends CarBuilder {

	private BMWModel bwm = new BMWModel();

	@Override
	public void setSequence(List<String> sequence) {
		this.bwm.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.bwm;
	}

}
