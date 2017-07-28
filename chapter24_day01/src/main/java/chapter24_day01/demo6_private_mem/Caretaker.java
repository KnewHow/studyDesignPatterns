package chapter24_day01.demo6_private_mem;
/**
 * A encapsulate for memento
 * @author ygh
 * Jul 28, 2017
 */
public class Caretaker {
	private IMemento memento;

	public IMemento getMemento() {
		return memento;
	}

	public void setMemento(IMemento memento) {
		this.memento = memento;
	}
	
	
}
