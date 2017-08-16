package demo;

/**
 * A product create factory
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public class ProductManager {
	/**
	 * Whether the product manager can create product
	 */
	private boolean isPermittedCreate = false;

	public boolean isPermittedCreate() {
		return isPermittedCreate;
	}

	/**
	 * Create a new product and it will produce a product creating event
	 * 
	 * @param name
	 *            The name of product
	 * @return A new product given name
	 */
	public Product createProduct(String name) {
		this.isPermittedCreate = true;
		Product product = new Product(this, name);
		new ProductEvent(product, ProductEventType.NEW_PRODUCT);
		return product;
	}

	/**
	 * Abandon a product and it will produce a product abandoning event
	 * 
	 * @param product
	 *            The product need to abandon
	 */
	public void abandonProduct(Product product) {
		new ProductEvent(product, ProductEventType.DEL_PRODUCT);
		product = null;
	}

	/**
	 * Edit the product and it will produce a product editing event
	 * 
	 * @param product
	 *            The product need to edit
	 * @param name
	 *            The new name of product which will be modified
	 */
	public void editProduct(Product product, String name) {
		product.setName(name);
		new ProductEvent(product, ProductEventType.EDIT_PRODUCT);
	}

	/**
	 * Clone a product and it will produce a cloning creating event
	 * 
	 * @param product
	 *            The product need to clone
	 * @return a product which is same as the product given
	 */
	public Product clone(Product product) {
		new ProductEvent(product, ProductEventType.CLONE_PRODUCT);
		return product.clone();
	}

}
