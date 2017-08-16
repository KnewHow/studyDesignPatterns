package demo;

/**
 * One way to deduct the money from card��only deduct free money
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017��8��16��
 *
 */
public class FreeDeduction implements IDeduction {

	@Override
	public boolean execute(Card card, Trade trade) {
		card.setFreeMoney(card.getFreeMoney() - trade.getAmout());
		return true;
	}

}
