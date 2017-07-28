package chapter24_day01.demo5_more_state;

import java.util.HashMap;
import java.util.Map;

public class Memento {
	private Map<String, Object> stateMap;

	public Memento(Map<String, Object> map) {
		super();
		this.stateMap = (HashMap<String, Object>) map;
	}

	public Map<String, Object> getStateMap() {
		return stateMap;
	}

	public void setStateMap(Map<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
	
	
}
