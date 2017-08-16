package demo.eventHandler;

import java.util.Vector;

import demo.ProductEvent;

/**
 * A abstract class of event customer
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public abstract class EventCustomer {
	private Vector<EventCustomerType> customTypes = new Vector<>();

	public EventCustomer(EventCustomerType eventCustomerType) {
		this.customTypes.addElement(eventCustomerType);
	}

	public void addEventCustomType(EventCustomerType eventCustomerType) {
		this.customTypes.addElement(eventCustomerType);
	}

	public Vector<EventCustomerType> getCustomTypes() {
		return customTypes;
	}

	public abstract void exec(ProductEvent productEvent);

}
