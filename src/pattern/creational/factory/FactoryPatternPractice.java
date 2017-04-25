package pattern.creational.factory;

public class FactoryPatternPractice {
	
	public static void main(String args[]){
		AnimalFactory animalFactory = AnimalFactory.getInstance();
		Animal a1 = animalFactory.getAnimal("dog");
		Animal a2 = animalFactory.getAnimal("cat");
		System.out.println(a1.makeSound());
		System.out.println(a2.makeSound());
	}
	
}
