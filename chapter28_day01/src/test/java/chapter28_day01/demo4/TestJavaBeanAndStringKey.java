package chapter28_day01.demo4;


import org.junit.Test;

public class TestJavaBeanAndStringKey {

	@Test
	public void fun1(){
		ExtrinsicState state = new ExtrinsicState();
		state.setLocation("上海");
		state.setSubject("科目1");
		SignInfoFactory.getSignInfo(state);
		
		ExtrinsicState state2 = new ExtrinsicState();
		state2.setLocation("上海");
		state2.setSubject("科目1");
		
		long currenTime = System.currentTimeMillis();
		for(int i=0;i<1000000;i++){
			SignInfoFactory.getSignInfo(state2);
		}
		
		long tailTime = System.currentTimeMillis();
		System.out.println(tailTime-currenTime+"ms");
	}
	
	

}
