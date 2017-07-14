package chapter02_day01.LSP.demo1.guncategory;

import chapter02_day01.LSP.demo1.AbstractGun;

public class MachineGun extends AbstractGun {

	@Override
	public void shoot() {
		System.out.println("machine gun shoot...");
	}

}
