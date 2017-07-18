package chapter11_day01.builderPattern;

/**
 * 
 * @author ygh Jul 18, 2017
 */
public class Client2 {
	public static void main(String[] args) {
		/**
		 * benzA and benzB is same object and bmwA and bwmB is same object. The
		 * distinction is the <code>sequence</code> is different
		 */
		Director director = new Director();
		BenzModel benzA = director.getBenzModelA();
		benzA.run();
		BenzModel benzB = director.getBenzModelB();
		benzB.run();
		BMWModel bmwA = director.getBMWModelA();
		bmwA.run();
		BMWModel bmwB = director.getBMWModelB();
		bmwB.run();
	}
}
