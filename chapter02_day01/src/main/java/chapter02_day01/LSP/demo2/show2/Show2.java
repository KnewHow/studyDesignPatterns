package chapter02_day01.LSP.demo2.show2;

import java.util.HashMap;

import org.junit.Test;

import chapter02_day01.LSP.demo2.show2.Father;
import chapter02_day01.LSP.demo2.show2.Son;

/**
 * Run result:
 * 
 * father class execute...
 * 
 * son class execute...
 * 
 * This run result is different from LSP,Why? In real program,sub-class don't
 * rewrite super class method,but execute! It make some terrible consequence.So
 * how to avoid it? If we make sure super class method execute or override, we
 * must make sure sub-class parameters is same or more extensive than super
 * class,you can reference show1.
 * 
 * 
 * @author ygh Jul 14, 2017
 */
public class Show2 {
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
