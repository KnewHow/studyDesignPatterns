package chapter25_day01.sum;
/**
 * 
 * @author ygh
 * Jul 29, 2017
 */
public class Client {
	public static void main(String[] args) {
		IVisitor visitor = new Visitor();
		for(int i=0;i<100;i++){
			ObjectStructure.createElement().accept(visitor);
		}
	}
}
