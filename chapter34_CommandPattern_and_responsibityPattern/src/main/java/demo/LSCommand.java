package demo;

/**
 * encapsulating ls command executor
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ15ÈÕ
 *
 */
public class LSCommand extends Command {

	@Override
	protected String execute(CommandVO vo) {
		CommandName firstNode = super.buildChain(AbstractLS.class).get(0);

		return firstNode.handleMessage(vo);
	}

}
