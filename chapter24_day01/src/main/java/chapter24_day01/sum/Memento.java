package chapter24_day01.sum;

/**
 * A class of memento
 * 
 * @author ygh Jul 28, 2017
 */
public class Memento {

	private String state;
	
	

	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
