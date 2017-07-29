package chapter25_day01.extenion_double_dispatch.demo2;

public class KungfuRole implements Role{

	@Override
	public void accept(AbstractActor actor) {
		actor.act(this);
	}

}
