package chapter11_day01.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * A director class to provide all user requests
 * 
 * @author ygh Jul 18, 2017
 */
public class Director {
	
	private List<String> sequence = new ArrayList<>();
	private BenzCarBuiler benzCarBuiler = new BenzCarBuiler();
	private BMWCarBuiler bwmCarBuiler = new BMWCarBuiler();

	public BenzModel getBenzModelA() {
		this.sequence.clear();
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		benzCarBuiler.setSequence(this.sequence);
		return (BenzModel) benzCarBuiler.getCarModel();
	}

	public BenzModel getBenzModelB() {
		this.sequence.clear();
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("engine boom");
		this.sequence.add("stop");
		benzCarBuiler.setSequence(this.sequence);
		return (BenzModel) benzCarBuiler.getCarModel();
	}

	public BMWModel getBMWModelA() {
		this.sequence.clear();
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		bwmCarBuiler.setSequence(this.sequence);
		return (BMWModel) this.bwmCarBuiler.getCarModel();
	}

	public BMWModel getBMWModelB() {
		this.sequence.clear();
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("engine boom");
		this.sequence.add("stop");
		bwmCarBuiler.setSequence(this.sequence);
		return (BMWModel) this.bwmCarBuiler.getCarModel();
	}
}
