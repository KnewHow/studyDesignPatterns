package buildPattern;

public class Director {
	private static Builder adultBuild = new AdultSuperManBuilder();
	
	private static Builder childBuild = new ChildSuperManBuilder();
	
	public static SuperMan getAdultSuperMan(){
		return adultBuild.getSuperMan();
	}
	
	public static SuperMan getChildSuperMan(){
		return childBuild.getSuperMan();
	}
}
