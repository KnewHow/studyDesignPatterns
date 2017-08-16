package demo;

/**
 * A interface of executing trade and reduce money
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017��8��16��
 *
 */
public interface IDeduction {
	public boolean execute(Card card, Trade trade);
}
