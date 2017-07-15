package chapter05_day01.demo2.show2;

/**
 * 
 * @author ygh
 * Jul 15, 2017
 */
public class Demo {
	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		InstallSoft soft = new InstallSoft();
		soft.install(wizard);
	}
}
