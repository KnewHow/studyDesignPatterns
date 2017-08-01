package statePattern;

public abstract class HumanState {
	protected Human human;

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}
	
	public abstract void work();
}
