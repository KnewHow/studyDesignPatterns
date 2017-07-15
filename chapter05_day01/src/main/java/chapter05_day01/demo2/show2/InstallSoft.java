package chapter05_day01.demo2.show2;

public class InstallSoft {
	public void install(Wizard wizard) {
		if (wizard.installWizard()) {
			System.out.println("wizard install success");
		} else {
			System.out.println("wizard install fail");
		}

	}

}
