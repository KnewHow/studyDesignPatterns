package chapter19_day01.sum;

import chapter19_day01.sum.target.ConcreteTarget;
import chapter19_day01.sum.target.Target;

public class Client {
	public static void main(String[] args) {
		fun1();
		fun2();
	}
	
	public static void fun1(){
		Target target = new ConcreteTarget();
		target.request();
	}
	
	public static void fun2(){
		Target target = new Adapter();
		target.request();
	}
}
