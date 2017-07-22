package chapter16_day01.errorExample.woman;

public class Woman implements WomenInterface {

	private int status = 0;

	private String request = "";

	public Woman(int status, String request) {
		super();
		this.status = status;
		this.request = request;
	}

	@Override
	public int getStatus() {
		return this.status;
	}

	@Override
	public String getRequest() {
		return this.request;
	}

}
