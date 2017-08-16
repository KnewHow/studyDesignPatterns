package demo;

/**
 * A context class of deduction
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public class DeductionContext {
	private IDeduction deduction;
	

	public DeductionContext(IDeduction deduction) {
		super();
		this.deduction = deduction;
	}

	public IDeduction getDeduction() {
		return deduction;
	}

	public void setDeduction(IDeduction deduction) {
		this.deduction = deduction;
	}

	public boolean execute(Card card, Trade trade) {
		return this.deduction.execute(card, trade);
	}
}
