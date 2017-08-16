package demo;

/**
 * A class to enum all product event
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public enum ProductEventType {

	/**
	 * New product
	 */
	NEW_PRODUCT(1),
	/**
	 * Delete product
	 */
	DEL_PRODUCT(2),
	/**
	 * Edit product
	 */
	EDIT_PRODUCT(3),
	/**
	 * Clone product
	 */
	CLONE_PRODUCT(4);

	private int value;

	private ProductEventType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
