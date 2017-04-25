package pattern.creational.singleton;

public class Singleton {
	
	/*정적변수*/
	private static Singleton instance = null;

	/*생성자 사용 금지*/
	private Singleton(){
		
	}
	
	/*정적메서드*/
	public static synchronized Singleton getInstance(){
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	
	public void sayHello(){
		System.out.println("sayHello");
	}
}
