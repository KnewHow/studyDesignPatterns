package chapter16_day01.responsibilityChain.handler;

import chapter16_day01.responsibilityChain.woman.WomenInterface;

/**
 * A abstract class of handler
 * 
 * @author ygh Jul 22, 2017
 */
public abstract class Handler {
	public static final int FATHER_LEVEL_REQUEST = 1;
	public static final int HUSBAND_LEVEL_REQUEST = 2;
	public static final int SON_LEVEL_REQUEST = 3;

	private int level = 0;

	private Handler nextHandler;

	public Handler(int level) {
		super();
		this.level = level;
	}

	/**
	 * Handle method
	 * 
	 * @param women
	 *            A women with request
	 */
	public final void handleMessage(WomenInterface women) {
		if (women.getStatus() == this.level) {
			response(women);
		} else {
			if (this.nextHandler != null) {
				/**
				 * Pass the request to next handler
				 */
				this.nextHandler.handleMessage(women);
			} else {
				System.out.println("---没地方请示，按不同意处理---");
			}
		}
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	/**
	 * The method which sub-class can implement it to do concrete response
	 * 
	 * @param women
	 *            A women with request
	 */
	public abstract void response(WomenInterface women);
}
