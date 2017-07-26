package chapter20_day01.demo2;


/**
 * 
 * @author ygh Jul 26, 2017
 */
public class Client {
	public static void main(String[] args) {
		IProject project = new Project();
		
		project.add("星球大战项目", 10, 100000);
		project.add("扭转时空项目", 100, 10000000);
		project.add("超人改造项目", 1000, 100000000);
		for (int i = 4; i < 104; i++) {
			project.add("第" + i + "个项目", i * 5, i * 10000);
		}
		
		IProjectIterator iterator = project.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().getProjectInfo());
		}
	}
}
