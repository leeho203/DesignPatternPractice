package pattern.creational.singleton;

public class SingletonPatternPractice {
	
	public static void main(String[] args){
		Singleton instance1 = Singleton.getInstance();
		instance1.sayHello();
		System.out.println(instance1);
		
		Singleton instance2 = Singleton.getInstance();
		instance2.sayHello();
		System.out.println(instance2);
	}
}
