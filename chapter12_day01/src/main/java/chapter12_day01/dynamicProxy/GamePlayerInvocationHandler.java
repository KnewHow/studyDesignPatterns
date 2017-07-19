package chapter12_day01.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerInvocationHandler implements InvocationHandler {

	private Before before;

	private After after;

	private Object target;

	public GamePlayerInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	public Before getBefore() {
		return before;
	}

	public void setBefore(Before before) {
		this.before = before;
	}

	public After getAfter() {
		return after;
	}

	public void setAfter(After after) {
		this.after = after;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (before != null) {
			before.beforeMethod();
		}
		Object result = method.invoke(target, args);
		if (after != null) {
			after.aferMethod();
		}
		return result;
	}

}
