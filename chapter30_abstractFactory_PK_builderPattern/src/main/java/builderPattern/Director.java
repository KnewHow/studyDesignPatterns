package builderPattern;

public class Director {
	private CarBuilder benzBuilder = new BenzBuilder();
	
	private CarBuilder bmwBuilder = new BMWBuilder();
	
	public ICar createBenzSuv(){
		return createCar(benzBuilder, "奔驰引擎", "奔驰轮胎");
	}
	
	public ICar createBMWSuv(){
		return createCar(bmwBuilder, "宝马引擎", "宝马轮胎");
	}
	
	public ICar createComplex(){
		return createCar(bmwBuilder, "宝马引擎", "奔驰轮胎");
	}
	private ICar createCar(CarBuilder builder,String engine,String wheel){
		Blueprint bp = new Blueprint();
		bp.setEngine(engine);
		bp.setWheel(wheel);
		builder.setBlueprint(bp);
		return builder.buildCar();
	}
}
