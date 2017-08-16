package demo;

import java.util.ArrayList;
import java.util.List;

public enum CommandEnum {
	ls("demo.LSCommand");

	private String value;

	private CommandEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static List<String> getName() {
		CommandEnum[] commandEnums = CommandEnum.values();
		List<String> names = new ArrayList<>();
		for (CommandEnum c : commandEnums) {
			names.add(c.name());
		}
		return names;
	}
	
	
}
