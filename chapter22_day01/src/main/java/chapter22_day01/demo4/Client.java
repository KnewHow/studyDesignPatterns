package chapter22_day01.demo4;

public class Client {
	public static void main(String[] args) {
		HanFeizi hanFeizi = new HanFeizi();
		Lisi lisi = new Lisi();
		hanFeizi.addObserver(lisi);
		
		hanFeizi.havaBreakFast();
		hanFeizi.havaFun();
	}
}
