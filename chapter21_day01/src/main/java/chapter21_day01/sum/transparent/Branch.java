package chapter21_day01.sum.transparent;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Component {
	private List<Component> subordinate = new ArrayList<>();

	@Override
	public void add(Component component) {
		component.setParent(this);
		this.subordinate.add(component);
	}

	@Override
	public void remove(Component component) {
		this.subordinate.remove(component);
	}

	@Override
	public List<Component> getSubordinate() {
		return this.subordinate;
	}

}
