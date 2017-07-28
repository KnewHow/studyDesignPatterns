package chapter24_day01.demo4_clone_way;

/**
 * The class need to backup,but in this case,we use clone method of objecet,then
 * we can set a backup object in self
 * 
 * @author ygh Jul 28, 2017
 */
public class Originator implements Cloneable {

	private Originator backup = null;
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

	public void createMemeoto() {
		try {
			this.backup = (Originator) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public void restoreMemento() {
		this.setState(this.backup.getState());
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
