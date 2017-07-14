package chapter02_day01.LSP.demo1;

import org.junit.Test;

import chapter02_day01.LSP.demo1.guncategory.Rifie;
import chapter02_day01.LSP.demo1.guncategory.rifie.AUGRifie;
import chapter02_day01.LSP.demo1.soldilerCategory.Snipper;

public class Demo1 {
	
	@Test
	public void fun1(){
		Soldier sanmao = new Soldier();
		sanmao.setGun(new Rifie());
		sanmao.killEnmey();
	}
	
	@Test
	public void fun2(){
		Snipper snipper = new Snipper();
		snipper.setGun(new AUGRifie());
		snipper.killEnmey();
	}
	
	@Test
	public void fun3(){
		Snipper snipper = new Snipper();
		snipper.setGun((AUGRifie)(new Rifie()));
		snipper.killEnmey();
	}
}
