package demo;

/**
 * One way to deduct the money from card£¬only deduct free money
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public class FreeDeduction implements IDeduction {

	@Override
	public boolean execute(Card card, Trade trade) {
		card.setFreeMoney(card.getFreeMoney() - trade.getAmout());
		return true;
	}

}
