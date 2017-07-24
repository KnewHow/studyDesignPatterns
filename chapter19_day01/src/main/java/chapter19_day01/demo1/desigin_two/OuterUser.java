package chapter19_day01.demo1.desigin_two;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map<String, String> getUserBaseInfo() {
		Map<String, String> map = new HashMap<>();
		map.put("userName", "The name is ygh");
		map.put("mobileNumber", "the mobile number is ...");
		return map;
	}

	@Override
	public Map<String, String> getUserOfficeInfo() {
		Map<String, String> map = new HashMap<>();
		map.put("jobPosition", "The job position is ...");
		map.put("officeTelNumber", "the office tel number is ...");
		return map;
	}

	@Override
	public Map<String, String> getUseHomeInfo() {

		Map<String, String> map = new HashMap<>();
		map.put("homeTelNumber", "The home tel number is ...");
		map.put("homeAddress", "the home address is ...");
		return map;
	}

}
