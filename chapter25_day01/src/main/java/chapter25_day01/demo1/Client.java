package chapter25_day01.demo1;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		for(Employee employee:mockEmployee()){
			employee.report();
		}
	}
	
	private static List<Employee> mockEmployee(){
		
		List<Employee> empList = new ArrayList<>();
		/**
		 * build employee zhangSan
		 */
		CommonEmployee zhangSan = new CommonEmployee();
		zhangSan.setJob("编写Java程序，决定蓝领，苦工加搬运工");
		zhangSan.setName("张三");
		zhangSan.setSalary(1800);
		zhangSan.setSex(Employee.MALE);
		empList.add(zhangSan);
		
		
		CommonEmployee liSi = new CommonEmployee();
		liSi.setJob("页面美工，审美素质太不流行！");
		liSi.setName("李四");
		liSi.setSalary(1900);
		liSi.setSex(Employee.FEMALE);
		empList.add(liSi);
		
		
		
		Manager manager = new Manager();
		manager.setPerformance("基本上是负值，但是会拍马屁！");
		manager.setName("王五");
		manager.setSalary(18750);
		manager.setSex(Employee.MALE);
		empList.add(manager);
		
		return empList;
	}
}
