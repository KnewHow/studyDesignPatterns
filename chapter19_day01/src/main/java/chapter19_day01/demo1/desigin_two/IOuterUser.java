package chapter19_day01.demo1.desigin_two;

import java.util.Map;

/**
 * Another design for user manage,this others design
 * 
 * @author ygh Jul 24, 2017
 */
public interface IOuterUser {
	public Map<String, String> getUserBaseInfo();

	public Map<String, String> getUserOfficeInfo();

	public Map<String, String> getUseHomeInfo();

}
