package chapter02_day01.LSP.demo1;

public class Soldier {
	private AbstractGun gun;

	public void setGun(AbstractGun gun) {
		this.gun = gun;
	}

	public void killEnmey() {
		System.out.println("Solider start kill enmey");
		gun.shoot();
	}
}
