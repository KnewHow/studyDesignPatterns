package demo;

import java.util.Observable;

/**
 * Product event listener
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public class ProductEvent extends Observable {
	/**
	 * The product
	 */
	private Product source;

	/**
	 * The product event type of this product
	 */
	private ProductEventType productEventType;

	/**
	 * The default constructor of {@link ProductEvent},it will caller create product
	 * listener
	 * 
	 * @param product
	 *            The product witch will produce create listener
	 */
	public ProductEvent(Product product) {
		this(product, ProductEventType.NEW_PRODUCT);
	}

	/**
	 * A constructor of {@link ProductEvent},it will initialize
	 * <code>resource</code> and <code>EventDispatch</code>
	 * 
	 * @param product
	 *            This will initialize <code>resource</code>
	 * @param productEventType
	 *            This will initialize <code>productEventType</code>
	 */
	public ProductEvent(Product product, ProductEventType productEventType) {
		this.source = product;
		this.productEventType = productEventType;
		notifyEvenetDispatch();

	}

	/**
	 * A method to notify observer
	 */
	private void notifyEvenetDispatch() {
		super.addObserver(EventDispatch.getEventDispatch());
		super.setChanged();
		super.notifyObservers(source);
	}

	public Product getSource() {
		return source;
	}

	public ProductEventType getProductEventType() {
		return productEventType;
	}

}
