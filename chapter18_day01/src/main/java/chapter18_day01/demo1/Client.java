package chapter18_day01.demo1;
/**
 * Just emulate practical scene
 * @author ygh
 * Jul 24, 2017
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context(new BackDoor());
		context.operate();
		context =new Context(new GivenGreenLight());
		context.operate();
		context = new Context(new BlockEnemy());
		context.operate();
	}
}
