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
		System.out.println("========ģ�ⴴ����Ʒ�¼�=======");
		System.out.println("����һ��С�к�ԭ�ӵ�");
		Product product = factory.createProduct("С�к�ԭ�ӵ�");
		factory.editProduct(product, "����");
		factory.clone(product);
		factory.abandonProduct(product);
	}
}
