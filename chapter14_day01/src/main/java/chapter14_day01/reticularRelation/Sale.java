package chapter14_day01.reticularRelation;

import java.util.Random;

/**
 * A class to sale computer
 * 
 * @author ygh Jul 21, 2017
 */
public class Sale {
	public void sellIBMComputer(int number) {
		Stock stock = new Stock();
		Purchase purchase = new Purchase();
		if (stock.getStockNumber() < number) {
			purchase.buyIBMComputer(number);
		}
		System.out.println("销售IBM电脑" + number + "台");
		stock.decrease(number);
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
		Stock stock = new Stock();
		System.out.println("折价销售IBM电脑" + stock.getStockNumber());
	}
}
