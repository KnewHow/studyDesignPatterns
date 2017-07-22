package chapter15_day01.commandPatternPerfect.groups;

public class Receiver {
	private Group cg;

	private Group rg;

	private Group pg;

	public Receiver() {
		super();
		this.rg = new RequirementGroup();
		this.pg = new PageGroup();
		this.cg = new CodeGroup();
	}

	public Receiver(Group cg, Group rg, Group pg) {
		super();
		this.cg = cg;
		this.rg = rg;
		this.pg = pg;
	}

	public Group getCg() {
		return cg;
	}

	public void setCg(Group cg) {
		this.cg = cg;
	}

	public Group getRg() {
		return rg;
	}

	public void setRg(Group rg) {
		this.rg = rg;
	}

	public Group getPg() {
		return pg;
	}

	public void setPg(Group pg) {
		this.pg = pg;
	}

}
