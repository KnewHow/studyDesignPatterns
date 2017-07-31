package buildPattern;

public abstract class Builder {
	SuperMan superMan = new SuperMan();

	public void setBody(String body) {
		this.superMan.setBody(body);
	}

	public void setSpecialTalent(String specialTalent) {
		this.superMan.setSpecialTalent(specialTalent);
	}

	public void setSpecialSymbol(String specialSymbol) {
		this.superMan.setSpecialSymbol(specialSymbol);
	}
	
	public abstract SuperMan getSuperMan();
}
