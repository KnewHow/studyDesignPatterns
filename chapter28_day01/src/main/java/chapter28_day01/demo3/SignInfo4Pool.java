package chapter28_day01.demo3;

/**
 * A class pool object for sign info
 * 
 * @author ygh Jul 30, 2017
 */
public class SignInfo4Pool extends SignInfo {

	private String key;

	public SignInfo4Pool(String key) {
		super();
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
