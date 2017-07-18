package chapter11_day01.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * A director class to provide all user requests
 * 
 * @author ygh Jul 18, 2017
 */
public class Director {

	private BenzCarBuiler benzCarBuiler = new BenzCarBuiler();
	private BMWCarBuiler bwmCarBuiler = new BMWCarBuiler();

	public BenzModel getBenzModelA() {
		List<String> sequence = new ArrayList<>();
		sequence.clear();
		sequence.add("start");
		sequence.add("stop");
		benzCarBuiler.setSequence(sequence);
		return (BenzModel) benzCarBuiler.getCarModel();
	}

	public BenzModel getBenzModelB() {
		List<String> sequence = new ArrayList<>();
		sequence.clear();
		sequence.add("start");
		sequence.add("engine boom");
		sequence.add("stop");
		benzCarBuiler.setSequence(sequence);
		return (BenzModel) benzCarBuiler.getCarModel();
	}

	public BMWModel getBMWModelA() {
		List<String> sequence = new ArrayList<>();
		sequence.clear();
		sequence.add("start");
		sequence.add("stop");
		bwmCarBuiler.setSequence(sequence);
		return (BMWModel) this.bwmCarBuiler.getCarModel();
	}

	public BMWModel getBMWModelB() {
		List<String> sequence = new ArrayList<>();
		sequence.clear();
		sequence.add("start");
		sequence.add("engine boom");
		sequence.add("stop");
		bwmCarBuiler.setSequence(sequence);
		return (BMWModel) this.bwmCarBuiler.getCarModel();
	}
}
