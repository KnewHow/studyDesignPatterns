package chapter14_day01.mediator;

public class Client {
	public static void main(String[] args) {
		/**
		 * in this case,purchase and sale and stock is the control object,the
		 * data object is in mediator.
		 * 
		 */
		AbstractMediator mediator = new Mediator();

		System.out.println("------采购人员采购电脑------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMComputer(100);

		System.out.println("------销售人员销售电脑------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);

		System.out.println("------库房管理人员清库处理------");
		Stock stock = new Stock(mediator);
		System.out.println(stock.getStockNumber());
		System.out.println(mediator.stock.getStockNumber());
		stock.clearStock();

		System.out.println(stock.equals(stock.mediator.stock));
	}

}
