package chapter02_day01.LSP.demo2.show2;

import java.util.Collection;
import java.util.Map;

/**
 * 
 * @author ygh Jul 14, 2017
 */
public class Father {
	@SuppressWarnings("rawtypes")
	public Collection dosomething(Map map) {
		System.out.println("father class execute...");
		return map.values();
	}
}
