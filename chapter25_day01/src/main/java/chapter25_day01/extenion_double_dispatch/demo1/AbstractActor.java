package chapter25_day01.extenion_double_dispatch.demo1;

public abstract class AbstractActor {
	public void act(Role role){
		System.out.println("演员什么角色都可以演");
	}
	public void act(KungfuRole role){
		System.out.println("演员都可以演功夫角色");
	}
}
