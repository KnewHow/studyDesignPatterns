package demo;

/**
 * A facade for deduct money
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public class DeductionFacade {

	/**
	 * 
	 * @param card
	 * @param trade
	 * @return
	 */
	public static Card deduct(Card card, Trade trade) {
		StrategyMan reg = getDeductionType(trade);
		IDeduction deduction = StrategyFactory.getDeduction(reg);
		DeductionContext context = new DeductionContext(deduction);
		context.execute(card, trade);
		return card;
	}

	/**
	 * Get different deduct type by different trade number
	 * 
	 * @param trade
	 * @return
	 */
	public static StrategyMan getDeductionType(Trade trade) {
		if (trade.getTradeNo().contains("abc")) {
			return StrategyMan.FreeDeduction;
		} else {
			return StrategyMan.SteadyDeduction;
		}
	}
}
