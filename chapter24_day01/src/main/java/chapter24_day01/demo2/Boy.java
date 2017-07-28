package chapter24_day01.demo2;

/**
 * The class need to backup state
 * 
 * @author ygh Jul 28, 2017
 */
public class Boy {
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void changeState() {
		this.state = "心情不好";
	}

	public Memento createMemeoto() {
		return new Memento(this.getState());
	}

	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
}
