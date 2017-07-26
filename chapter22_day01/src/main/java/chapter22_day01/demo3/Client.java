package chapter22_day01.demo3;

public class Client {
	public static void main(String[] args) {
		Observer ob1 = new Lisi();
		Observer ob2 = new LiuSi();
		Observer ob3 = new WangSi();
		HanFeizi hanFeizi = new HanFeizi();
		hanFeizi.addObserver(ob1);
		hanFeizi.addObserver(ob2);
		hanFeizi.addObserver(ob3);
		hanFeizi.havaBreakFast();
		hanFeizi.havaFun();
	}
}
