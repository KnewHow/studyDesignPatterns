package demo;

public abstract class CommandName {

	/**
	 * The next command hander
	 */
	private CommandName nextOperator;

	/**
	 * All command handle method,it will caller sub class method to finish concrete
	 * command and parameter handle.
	 * 
	 * @param vo
	 *            A concrete command object that store command name,parameters and
	 *            operation
	 * @return A result of command execute,it it a string
	 */
	public final String handleMessage(CommandVO vo) {
		String result = "";
		if (vo.getParamList().size() == 0 || vo.getParamList().contains(this.getOperateParam())) {
			result = this.echo(vo);
		} else {
			if (this.nextOperator != null) {
				result = this.nextOperator.handleMessage(vo);
			} else {
				result = "command don't execute";
			}
		}
		return result;
	}

	public void setNextOperator(CommandName nextOperator) {
		this.nextOperator = nextOperator;
	}

	/**
	 * sub class will implement this method to give concrete parameter
	 * 
	 * @return A String of command parameters
	 */
	protected abstract String getOperateParam();

	/**
	 * command deal with method,sub classes will implement this method to finish
	 * concrete parameter deal with
	 * 
	 * @param vo
	 * @return
	 */
	protected abstract String echo(CommandVO vo);
}
