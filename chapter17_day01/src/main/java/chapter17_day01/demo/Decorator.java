package chapter17_day01.demo;
/**
 * A abstract decorator class 
 * @author ygh
 * Jul 24, 2017
 */
public abstract class Decorator extends Component {

	/**
	 * A implementable class of component for do some
	 * primary operation
	 */
	private Component component;

	public Decorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void operate() {
		this.component.operate();
	}

}
