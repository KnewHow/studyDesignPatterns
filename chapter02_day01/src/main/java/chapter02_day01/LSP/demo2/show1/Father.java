package chapter02_day01.LSP.demo2.show1;

import java.util.Collection;
import java.util.HashMap;

/**
 * 
 * @author ygh Jul 14, 2017
 */
public class Father {
	@SuppressWarnings("rawtypes")
	public Collection dosomething(HashMap map) {
		System.out.println("father class execute...");
		return map.values();
	}
}
