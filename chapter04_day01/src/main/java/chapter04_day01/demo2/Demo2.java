package chapter04_day01.demo2;
/**
 * 
 * @author ygh
 * Jul 15, 2017
 */
public class Demo2 {
	public static void main(String[] args) {
		PerfectGirl pettyGirl = new PerfectGirl();
		AbstractSearcher abstractSearcher = new Searcher(pettyGirl);
		abstractSearcher.show();
	}
}
