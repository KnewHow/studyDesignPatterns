package chapter19_day01.demo2.design_two;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo{

	@Override
	public Map<String, String> getUserBaseInfo() {
		Map<String, String> map = new HashMap<>();
		map.put("userName", "The name is ygh");
		map.put("mobileNumber", "the mobile number is ...");
		return map;
	}

}
