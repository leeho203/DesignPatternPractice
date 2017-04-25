package pattern.creational.abstractfactory;

public class AbstractFactoryPatternPractice {
	public static void main(String[] args){
		SpeciesFactory speciesFactory1 = AbstractFactory.getSpeciesFactory("mammal");
		SpeciesFactory speciesFactory2 = AbstractFactory.getSpeciesFactory("reptile");

		Animal a1 = speciesFactory1.getAnimal("dog");
		Animal a2 = speciesFactory1.getAnimal("cat");
		Animal a3 = speciesFactory2.getAnimal("snake");
		Animal a4 = speciesFactory2.getAnimal("tyrannosaurus");
		
		System.out.println(a1.makeSound());
		System.out.println(a2.makeSound());
		System.out.println(a3.makeSound());
		System.out.println(a4.makeSound());
	}
}
