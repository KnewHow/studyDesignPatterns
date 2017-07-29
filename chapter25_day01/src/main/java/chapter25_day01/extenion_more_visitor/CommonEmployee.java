package chapter25_day01.extenion_more_visitor;

public class CommonEmployee extends Employee {

	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	

}
