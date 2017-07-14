package chapter02_day01.LSP.demo2.show1;
/**
 * 
 * @author ygh
 * Jul 14, 2017
 */

import java.util.HashMap;

import org.junit.Test;

/**
 * Run result:
 * 
 * father class execute...
 * 
 * father class execute...
 * 
 * In this case,we prove the "Functions that use pointers or references to base
 * classes must be able to use objects of derived classes without knowing"
 * 
 * @author ygh Jul 14, 2017
 */
public class Show1 {
	@Test
	public void fun1() {
		Father f = new Father();
		f.dosomething(new HashMap<>());
	}

	@Test
	public void fun2() {
		Son s = new Son();
		s.dosomething(new HashMap<>());
	}
}
