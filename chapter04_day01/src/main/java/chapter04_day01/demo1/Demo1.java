package chapter04_day01.demo1;
/**
 * 
 * @author ygh
 * Jul 15, 2017
 */
public class Demo1 {
	public static void main(String[] args) {
		PettyGirl pettyGirl = new MyPettyGirl();
		AbstractSearcher abstractSearcher = new Searcher(pettyGirl);
		abstractSearcher.show();
	}
}
