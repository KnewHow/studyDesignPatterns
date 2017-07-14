package chapter02_day01.LSP.demo2.show1;

import java.util.Collection;
import java.util.Map;

public class Son extends Father {

	/**
	 * This method is reload ,not rewrite,because parameters is different
	 * 
	 * @param map
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Collection dosomething(Map map) {
		System.out.println("son class execute...");
		return map.values();
	}

}
