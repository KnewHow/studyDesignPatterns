package chapter28_day01.demo1;

import java.util.HashMap;

public class SignInfoFactory {
	private static HashMap<String, SignInfo> pool = new HashMap<>();
	
	public static SignInfo getSignInfo(){
		return new SignInfo();
	}
}
