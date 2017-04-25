package pattern.creational.prototype;

public class PrototypePatternPractice {
	
	public static void main(String[] args){
		Animal a1 = new Animal("dog");
		Animal a2 = (Animal) a1.doClone();
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		
		Person p1 = new Person("john");
		Person p2 = (Person) p1.doClone();
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
	
}
