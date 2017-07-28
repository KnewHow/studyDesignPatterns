package chapter23_day01.sum.subsystem;

/**
 * A unified interface which can be access by outer
 * 
 * @author ygh Jul 28, 2017
 */
public class Facade {
	A a = new A();
	B b = new B();
	C c = new C();

	ComplexClass complexClass = new ComplexClass();

	public void method1() {
		a.methodA();
	}

	public void method2() {
		b.methodA();
	}

	public void method3() {
		c.methodA();
	}

	/**
	 * This type method don't allow write in facade, because it involve
	 * subsystem
	 */
	public void method4() {
		a.methodA();
		c.methodA();
	}

	/**
	 * This is the right method to provide to outer
	 */
	public void method5() {
		complexClass.methodA();
	}
}
