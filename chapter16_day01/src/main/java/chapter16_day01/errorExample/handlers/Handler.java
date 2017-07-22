package chapter16_day01.errorExample.handlers;

import chapter16_day01.errorExample.woman.WomenInterface;

/**
 * A handle class to deal with the woman requests
 * 
 * @author ygh Jul 22, 2017
 */
public interface Handler {
	/**
	 * A handle method that sub-class can implement to deal with concrete
	 * request
	 * 
	 * @param women
	 */
	public void handleMessage(WomenInterface women);
}
