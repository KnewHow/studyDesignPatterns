package demo;

public enum StrategyMan {
	SteadyDeduction("demo.SteadyDeduction"), FreeDeduction("demo.FreeDeduction.java");

	String value = "";

	private StrategyMan(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
