package demo;

/**
 * The default ls command
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017��8��15��
 *
 */
public class LS extends AbstractLS {

	@Override
	protected String getOperateParam() {
		return "ls no parameter execute";
	}

	@Override
	protected String echo(CommandVO vo) {
		return AbstractLS.DEFAULT_PARAM;
	}

}
