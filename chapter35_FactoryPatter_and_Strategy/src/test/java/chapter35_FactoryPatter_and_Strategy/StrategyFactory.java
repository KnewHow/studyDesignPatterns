package chapter35_FactoryPatter_and_Strategy;

import demo.IDeduction;
import demo.StrategyMan;

/**
 * A factory to get a strategy
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public class StrategyFactory {
	public static IDeduction getDeduction(StrategyMan man) {
		IDeduction deduction = null;
		try {
			deduction = (IDeduction) Class.forName(man.getValue()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return deduction;
	}
}
