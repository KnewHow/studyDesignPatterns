package demo.eventHandler;

import demo.Product;
import demo.ProductEvent;
import demo.ProductEventType;

/**
 * A beggar class only can deal with {@link EventCustomerType#EDIT} and
 * {@link EventCustomerType#CLONE}
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017��8��16��
 *
 */
public class Nobleman extends EventCustomer {

	public Nobleman() {
		super(EventCustomerType.EDIT);
		super.addEventCustomType(EventCustomerType.CLONE);
	}

	@Override
	public void exec(ProductEvent productEvent) {
		Product product = productEvent.getSource();
		ProductEventType type = productEvent.getProductEventType();
		System.out.println("Nobleman only can deal with" + product.getName() + "���ͣ�" + type);
	}

}
