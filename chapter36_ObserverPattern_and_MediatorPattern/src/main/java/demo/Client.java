package demo;

import demo.eventHandler.Beggar;
import demo.eventHandler.Commoner;
import demo.eventHandler.Nobleman;

public class Client {
	public static void main(String[] args) {
		EventDispatch eventDispatch = EventDispatch.getEventDispatch();

		eventDispatch.registerCustomers(new Beggar());
		eventDispatch.registerCustomers(new Commoner());
		eventDispatch.registerCustomers(new Nobleman());

		ProductManager factory = new ProductManager();
		System.out.println("========模拟创建产品事件=======");
		System.out.println("创建一个小男孩原子弹");
		Product product = factory.createProduct("小男孩原子弹");
		factory.editProduct(product, "胖子");
		factory.clone(product);
		factory.abandonProduct(product);
	}
}
