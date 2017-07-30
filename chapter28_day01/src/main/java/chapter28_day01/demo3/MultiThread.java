package chapter28_day01.demo3;

public class MultiThread extends Thread {

	private SignInfo info;

	public MultiThread(SignInfo info) {
		super();
		this.info = info;
	}

	@Override
	public void run() {
		if (!this.info.getId().equals(this.info.getLocation())) {
			System.out.println("编号" + this.info.getId());
			System.out.println("考试地址：" + this.info.getLocation());
		}
	}

}
