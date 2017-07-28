package chapter24_day01.demo5_more_state_more;

import java.util.HashMap;
import java.util.Map;

/**
 * A encapsulate for memento
 * 
 * @author ygh Jul 28, 2017
 */
public class Caretaker {
	private Map<String, Memento> memMap = new HashMap<>();

	public Memento getMemento(String id) {
		return this.getMemento(id);
	}

	public void setMemento(String id, Memento memento) {
		this.memMap.put(id, memento);
	}

}
