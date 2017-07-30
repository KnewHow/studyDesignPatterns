package chapter28_day01.demo2;

import java.util.HashMap;

public class SignInfoFactory {
	private static HashMap<String, SignInfo> pool = new HashMap<>();

	@Deprecated
	public static SignInfo getSignInfo() {
		return new SignInfo();
	}

	public static SignInfo getSignInfo(String key) {
		SignInfo result = null;
		if (!pool.containsKey(key)) {
//			System.out.println(key + "----build object and put in pool----");
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		} else {
//			System.out.println(key + "---get object from pool---");
			result = pool.get(key);
		}
		return result;
	}
}
