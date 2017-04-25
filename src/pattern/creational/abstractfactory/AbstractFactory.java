package pattern.creational.abstractfactory;

public class AbstractFactory {
	public static SpeciesFactory getSpeciesFactory(String type){
		if("mammal".equals(type)){
			return new MammalFactory();
		}else{
			return new ReptileFactory();
		}
	}
}
