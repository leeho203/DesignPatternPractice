package pattern.creational.factory;

public class AnimalFactory {
	
	private static AnimalFactory animalFactory = null;
	
	private AnimalFactory(){
		
	}
	
	public static AnimalFactory getInstance(){
		if(animalFactory == null)
			animalFactory = new AnimalFactory();
		return animalFactory;
	}
	
	public Animal getAnimal(String type){
		if("dog".equals(type)){
			return new Dog();
		}else{
			return new Cat();
		}
	}
	
}
