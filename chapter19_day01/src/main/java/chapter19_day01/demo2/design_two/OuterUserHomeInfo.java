package chapter19_day01.demo2.design_two;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo{

	@Override
	public Map<String, String> getUserHomeInfo() {
		Map<String, String> map = new HashMap<>();
		map.put("homeTelNumber", "The home tel number is ...");
		map.put("homeAddress", "the home address is ...");
		return map;
	}

}
