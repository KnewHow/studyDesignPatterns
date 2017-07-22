package chapter16_day01.sum.handler;

import chapter16_day01.sum.Level;
import chapter16_day01.sum.Request;
import chapter16_day01.sum.Response;

/**
 * A abstract class of handler.Define a handler method handleMessage but
 * sub-class can implement echo method to deal with concrete request and resonse
 * 
 * @author ygh Jul 22, 2017
 */
public abstract class Handler {


	private Handler nextHandler;


	public final Response handleMessage(Request request) {
		Response repon = null;
		if (request.getLevel().equals(this.getLevel())) {
			repon = this.echo();
		} else {
			if (this.nextHandler != null) {
				repon = this.nextHandler.handleMessage(request);
			} else {

			}
		}
		return repon;
	}

	public abstract Response echo();

	public abstract Level getLevel();

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

}
