package chapter14_day01.mediator;

import java.util.Random;

public class Sale extends AbstractColleague {

	public Sale(AbstractMediator mediator) {
		super(mediator);
	}

	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("销售IBM电脑" + number + "台");
	}

	/**
	 * Get the status of sale from 0 to 100 0 indicate no one buy computer
	 * 
	 * @return the number of computer has been sold
	 */
	public int getSaleStatus() {
		Random random = new Random();
		int saleStatus = random.nextInt(100);
		System.out.println("IBM电脑的销售情况为：" + saleStatus);
		return saleStatus;
	}

	/**
	 * discount sell computer
	 */
	public void offSale() {
		super.mediator.execute("sale.offsell");
	}

}
