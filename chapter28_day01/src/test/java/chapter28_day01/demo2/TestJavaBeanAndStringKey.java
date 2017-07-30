package chapter28_day01.demo2;

import org.junit.Test;

import chapter28_day01.demo2.SignInfoFactory;

public class TestJavaBeanAndStringKey {

	@Test
	public void test() {
		String key1="科目1上海";
		String key2="科目1上海";
		SignInfoFactory.getSignInfo(key1);
		long currenTime = System.currentTimeMillis();
		for(int i=0;i<1000000;i++){
			SignInfoFactory.getSignInfo(key2);
		}
		
		long tailTime = System.currentTimeMillis();
		System.out.println(tailTime-currenTime+"ms");
	}

}
