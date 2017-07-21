package chapter14_day01.reticularRelation;

/**
 * A class of purchase to purchase computer
 * 
 * @author ygh Jul 21, 2017
 */
public class Purchase {
	public void buyIBMComputer(int number) {
		Stock stock = new Stock();
		Sale sale = new Sale();
		int saleStatus = sale.getSaleStatus();
		/*
		 * If the sale is good
		 */
		if (saleStatus > 80) {
			System.out.println("采购IBM电脑：" + number);
			stock.increase(number);
		} else {
			/**
			 * if the sale is bad
			 */
			int buyNumber = number / 2;
			System.out.println("采购IBM电脑：" + buyNumber);
			stock.increase(buyNumber);
		}
	}
	
	public void refuseBuyIBM(){
		System.out.println("不再采购IBM电脑");
	}
}
