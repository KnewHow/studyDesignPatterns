package chapter25_day01.sum;
/**
 * A visitor interface
 * @author ygh
 * Jul 29, 2017
 */
public interface IVisitor {
	public void visit(ConcreteElement1 element);

	public void visit(ConcreteElement2 element);
}
