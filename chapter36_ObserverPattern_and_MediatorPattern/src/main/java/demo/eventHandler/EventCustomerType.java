package demo.eventHandler;

/**
 * A enum of event customers
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017��8��16��
 *
 */
public enum EventCustomerType {
	/**
	 * new event
	 */
	NEW(1),
	/**
	 * Delete event
	 */
	DEL(2),
	/**
	 * Edit event
	 */
	EDIT(3),
	/**
	 * Clone event
	 */
	CLONE(4);
	private int value;

	private EventCustomerType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
