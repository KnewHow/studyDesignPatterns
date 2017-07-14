package chapter02_day01.LSP.demo1.guncategory.rifie;

import chapter02_day01.LSP.demo1.guncategory.Rifie;

public class AUGRifie extends Rifie {

	@Override
	public void shoot() {
		System.out.println("AUG rifie shoot...");
	}
	
	public void zoomOut(){
		System.out.println("view emeny by binoculars");
	}
	
}
