package chapter02_day01.LSP.demo2.show2;

import java.util.Collection;
import java.util.HashMap;

public class Son extends Father {

	/**
	 * This method is reload ,not rewrite,because parameters is different
	 * 
	 * @param map
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Collection dosomething(HashMap map) {
		System.out.println("son class execute...");
		return map.values();
	}

}
