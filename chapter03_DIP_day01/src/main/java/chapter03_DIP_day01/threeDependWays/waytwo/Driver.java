package chapter03_DIP_day01.threeDependWays.waytwo;

import chapter03_DIP_day01.success.example.demo1.Car;
/**
 * Depend abstractions by setter
 * @author ygh
 * Jul 15, 2017
 */
public interface Driver {
	public void setCar(Car car);

	public void drive();
}
