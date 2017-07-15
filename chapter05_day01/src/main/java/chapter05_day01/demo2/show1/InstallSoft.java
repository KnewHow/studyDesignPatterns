package chapter05_day01.demo2.show1;

public class InstallSoft {
	public boolean install(Wizard wizard) {
		if (wizard.first() > 50) {
			if (wizard.second() > 50) {
				if (wizard.third() > 50) {
					System.out.println("install success");
					return true;
				}
			}
		}
		
		System.out.println("install fail");
		return false;
	}
	
}
