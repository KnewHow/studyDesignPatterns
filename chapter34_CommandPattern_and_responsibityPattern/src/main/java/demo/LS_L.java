package demo;

/**
 * The ls -l command
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ15ÈÕ
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
