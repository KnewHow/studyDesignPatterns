package chapter14_day01.mediator;

public class Purchase extends AbstractColleague {

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}

	public void buyIBMComputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}

	public void refuseBuyIBM() {
		System.out.println("不在采购IBM电脑");
	}

}
