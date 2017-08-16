package demo;

/**
 * The ls -a command
 * @author yuangh
 *
 * Company:Erongdu
 *
 * 2017��8��15��
 *
 */
public class LS_A extends AbstractLS{

	@Override
	protected String getOperateParam() {
		return "ls -l execute";
	}

	@Override
	protected String echo(CommandVO vo) {
		return AbstractLS.L_PARAM;
	}

}
