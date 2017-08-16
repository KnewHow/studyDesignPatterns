package demo;

/**
 * A class to describe product
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public class Product implements Cloneable {
	/**
	 * The name of product
	 */
	private String name;

	/**
	 * Whether the product can change
	 */
	private boolean canChange = false;

	/**
	 * A constructor of product,when the factory is useful,it can create product
	 * object
	 * 
	 * @param manager
	 * @param name
	 */
	public Product(ProductManager manager, String name) {
		super();
		if (manager.isPermittedCreate()) {
			this.canChange = true;
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public boolean isCanChange() {
		return canChange;
	}

	@Override
	protected Product clone() {
		Product product = null;
		try {
			product = (Product) super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return product;
	}

}
