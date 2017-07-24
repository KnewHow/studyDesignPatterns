package chapter19_day01.demo2.design_two;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	@Override
	public Map<String, String> getUserOfficeInfo() {
		Map<String, String> map = new HashMap<>();
		map.put("jobPosition", "The job position is ...");
		map.put("officeTelNumber", "the office tel number is ...");
		return map;
	}

}
