package demo;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import demo.eventHandler.EventCustomer;
import demo.eventHandler.EventCustomerType;

/**
 * A class is response to dispatch all event handler,and this class is single.
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public class EventDispatch implements Observer {

	/**
	 * The single object
	 */
	private final static EventDispatch eventDispatch = new EventDispatch();

	/**
	 * A collection of {@link EventCustomer},that will deal with the event
	 */
	private Vector<EventCustomer> customers = new Vector<>();

	private EventDispatch() {
		super();
	}

	public static EventDispatch getEventDispatch() {
		return eventDispatch;
	}

	/**
	 * register {@link #customers}
	 * 
	 * @param eventCustomer
	 *            The event customer will be registered in {@link #customers}n
	 */
	public void registerCustomers(EventCustomer eventCustomer) {
		this.customers.add(eventCustomer);
	}

	@Override
	public void update(Observable o, Object arg) {
		ProductEvent event = (ProductEvent) o;
		for (EventCustomer customer : customers) {
			for (EventCustomerType type : customer.getCustomTypes()) {
				if (event.getProductEventType().getValue() == type.getValue()) {
					customer.exec(event);
				}
			}
		}
	}

}
