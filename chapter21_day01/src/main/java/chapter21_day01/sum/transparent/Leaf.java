package chapter21_day01.sum.transparent;

import java.util.List;

public class Leaf extends Component {

	@Deprecated
	@Override
	public void add(Component component) {
		throw new UnsupportedOperationException();
	}

	@Deprecated
	@Override
	public void remove(Component component) {
		throw new UnsupportedOperationException();

	}

	@Deprecated
	@Override
	public List<Component> getSubordinate() {
		throw new UnsupportedOperationException();
	}

}
