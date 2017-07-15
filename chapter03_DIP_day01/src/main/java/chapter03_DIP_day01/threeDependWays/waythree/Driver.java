package chapter03_DIP_day01.threeDependWays.waythree;

import chapter03_DIP_day01.success.example.demo1.Car;

/**
 * Depend abstraction by method parameters
 * 
 * @author ygh Jul 15, 2017
 */
public interface Driver {

	public void drive(Car car);
}
