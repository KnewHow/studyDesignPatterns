package chapter25_day01.extenion_double_dispatch.demo1;

public class OldActor extends AbstractActor{

	@Override
	public void act(KungfuRole role) {
		System.out.println("老了，不能演功夫角色");
	}
	
}
