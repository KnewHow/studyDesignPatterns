package demo;

/**
 * One way to deduct the money from card,half from steady money and another from
 * free money
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public class SteadyDeduction implements IDeduction {

	@Override
	public boolean execute(Card card, Trade trade) {
		int halfMoney = (int) Math.rint(trade.getAmout() / 2.0);
		card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
		card.setFreeMoney(card.getFreeMoney() - halfMoney);
		return true;
	}

}
