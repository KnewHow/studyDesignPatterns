package chapter14_day01.mediator;

public class Test {
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		Stock stock = new Stock(mediator);
		System.out.println(stock.getStockNumber());
	}
}
