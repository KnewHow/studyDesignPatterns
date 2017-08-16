package chapter35_FactoryPatter_and_Strategy;

import org.junit.Test;

import demo.StrategyMan;

public class TestEnum {

	@Test
	public void test() {
		System.out.println(getDeductionType().getValue());
	}
	
	private StrategyMan getDeductionType() {
		return StrategyMan.FreeDeduction;
	}

}
