package abstractFactory;

public class BenzFactory implements CarFactory{

	@Override
	public ICar createSuv() {
		return new BenzSuv();
	}

	@Override
	public ICar createVan() {
		return new BenzVan();
	}

}
