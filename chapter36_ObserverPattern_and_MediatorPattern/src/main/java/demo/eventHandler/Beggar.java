package demo.eventHandler;

import demo.Product;
import demo.ProductEvent;
import demo.ProductEventType;

/**
 * A beggar class only can deal with {@link EventCustomerType#DEL}
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017年8月16日
 *
 */
public class Beggar extends EventCustomer {

	public Beggar() {
		super(EventCustomerType.DEL);
	}

	@Override
	public void exec(ProductEvent productEvent) {
		Product product = productEvent.getSource();
		ProductEventType type = productEvent.getProductEventType();
		System.out.println("beggar only can deal with" + product.getName() + "类型：" + type);
	}

}
