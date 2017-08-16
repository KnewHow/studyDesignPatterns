package demo;

import java.util.ArrayList;
import java.util.List;

import utils.ClassUtils;

/**
 * A class to encapsulate all command
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ15ÈÕ
 *
 */
public abstract class Command {
	/**
	 * Command execute
	 * 
	 * @param vo
	 * @return
	 */
	protected abstract String execute(CommandVO vo);

	/**
	 * Constructor chain list of command
	 * 
	 * @param abstractClass
	 * @return
	 */
	protected final List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass) {
		List<Class<?>> classes = ClassUtils.getSonClass(abstractClass);
		List<CommandName> commandNameList = new ArrayList<>();
		for (Class<?> c : classes) {
			CommandName commandName = null;
			try {
				commandName = (CommandName) Class.forName(c.getName()).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (commandNameList.size() > 0) {
				commandNameList.get(commandNameList.size() - 1).setNextOperator(commandName);
			}
		}

		return commandNameList;

	}
}
