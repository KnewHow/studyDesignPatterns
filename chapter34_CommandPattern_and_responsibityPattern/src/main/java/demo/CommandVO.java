package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to encapsulate concrete command and executive parameters
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ15ÈÕ
 *
 */
public class CommandVO {
	/**
	 * The separator between command and parameters
	 */
	public final static String SEPARATOR = " ";

	/**
	 * The prefix of parameter
	 */
	public final static String PARAMETER_PREFIX = "-";

	/**
	 * The name of command
	 */
	private String commandName = "";

	/**
	 * The parameters
	 */
	private List<String> paramList = new ArrayList<String>();

	/**
	 * All operations list
	 */
	private List<String> dataList = new ArrayList<>();

	/**
	 * A constructor of {@link CommandVO},in this we will parse the command and
	 * category parameters and operations
	 * 
	 * @param commandStr
	 */
	public CommandVO(String commandStr) {
		if (commandStr != null && commandStr.length() != 0) {
			String[] complexStr = commandStr.split(CommandVO.SEPARATOR);
			this.commandName = complexStr[0];
			for (int i = 1; i < complexStr.length; i++) {
				String s = complexStr[i];
				if (s.indexOf(CommandVO.PARAMETER_PREFIX) == 0) {
					this.paramList.add(s.replace(CommandVO.PARAMETER_PREFIX, "").trim());
				} else {
					this.dataList.add(s.trim());
				}
			}
		} else {
			System.out.println("this command parses fail");
		}
	}

	public String getCommandName() {
		return commandName;
	}

	public List<String> getParamList() {
		return paramList;
	}

	public List<String> getDataList() {
		return dataList;
	}

}
