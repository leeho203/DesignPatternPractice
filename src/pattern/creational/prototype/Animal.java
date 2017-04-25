package pattern.creational.prototype;

public class Animal implements Prototype{
	
	private String sound;
	
	public Animal(String sound){
		this.sound = sound;
	}
	
	@Override
	public Prototype doClone() {
		return new Animal(sound);
	}

	public String toString(){
		return "This dog says " + sound;
	}
}
