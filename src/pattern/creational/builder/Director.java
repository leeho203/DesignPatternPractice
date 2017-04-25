package pattern.creational.builder;

public class Director {
	private Builder builder = null;
	
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public void constructProduct(){
		builder.buildName();
		builder.buildType();
	}
	
	public Product getProduct(){
		return builder.getProduct();
	}
}
