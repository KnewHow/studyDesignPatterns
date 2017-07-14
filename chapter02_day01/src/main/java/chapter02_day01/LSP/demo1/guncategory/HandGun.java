package chapter02_day01.LSP.demo1.guncategory;

import chapter02_day01.LSP.demo1.AbstractGun;

public class HandGun extends AbstractGun{

	@Override
	public void shoot() {
		System.out.println("hand gun shoot...");
	}

}
