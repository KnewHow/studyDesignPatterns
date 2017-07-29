package chapter25_day01.extenion_statistic;

public class Manager extends Employee {

	private String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
