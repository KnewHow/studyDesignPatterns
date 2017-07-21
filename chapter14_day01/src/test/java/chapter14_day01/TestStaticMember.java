package chapter14_day01;

public class TestStaticMember {
	public static void main(String[] args) {
		ABC a = new ABC();
		a.sub();
		System.out.println(a.getNumber());
		ABC b = new ABC();
		System.out.println(b.getNumber());
	}
}
