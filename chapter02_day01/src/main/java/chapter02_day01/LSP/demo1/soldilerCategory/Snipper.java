package chapter02_day01.LSP.demo1.soldilerCategory;

import chapter02_day01.LSP.demo1.Soldier;
import chapter02_day01.LSP.demo1.guncategory.rifie.AUGRifie;

public class Snipper extends Soldier {

	private AUGRifie aUGRifie;

	public void setGun(AUGRifie rifie) {
		this.aUGRifie = rifie;
	}

	@Override
	public void killEnmey() {
		aUGRifie.zoomOut();
		aUGRifie.shoot();
	}

}
