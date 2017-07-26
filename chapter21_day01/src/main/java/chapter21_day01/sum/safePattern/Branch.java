package chapter21_day01.sum.safePattern;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Component {
	private List<Component> subordinate = new ArrayList<>();

	public void add(Component component) {
		component.setParent(this);
		this.subordinate.add(component);
	}
	
	public void remove(Component component) {
		this.subordinate.remove(component);
	}

	public List<Component> getSubordinate() {
		return this.subordinate;
	}

}
