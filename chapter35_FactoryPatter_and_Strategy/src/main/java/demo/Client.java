package demo;

public class Client {
	public static void main(String[] args) {
		Card card = initCard();
		showCard(card);
		Trade trade = new Trade();
		trade.setAmout(1000);
		trade.setTradeNo("123");
		DeductionFacade.deduct(card, trade);
		showCard(card);
	}

	private static void showCard(Card card) {
		System.out.println(card.toString());
	}

	private static Card initCard() {
		Card card = new Card();
		card.setCardNo("11000011001010");
		card.setFreeMoney(10000);
		card.setSteadyMoney(8000);
		return card;
	}
}
