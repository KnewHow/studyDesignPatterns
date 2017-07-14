package chapter02_day01.LSP.demo1.guncategory;

import chapter02_day01.LSP.demo1.AbstractGun;
/**
 * A class to implement rifie
 * @author ygh
 * Jul 14, 2017
 */
public class Rifie extends AbstractGun {

	@Override
	public void shoot() {
		System.out.println("rifie shoot...");
	}

}
