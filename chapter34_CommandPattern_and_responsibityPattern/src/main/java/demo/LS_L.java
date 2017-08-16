package demo;

/**
 * The ls -l command
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017��8��15��
 *
 */
public class LS_L extends AbstractLS {

	@Override
	protected String getOperateParam() {
		return "ls -a execute";
	}

	@Override
	protected String echo(CommandVO vo) {
		return AbstractLS.A_PARAM;
	}

}
