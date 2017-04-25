package pattern.creational.builder;

public class BuilderPatternPractice {
	
	public static void main(String args[]){
		Builder builder = null;
		Director director = null;
		Product product = null;
		
		builder = new FirstBuilder();
		director = new Director(builder);
		director.constructProduct();
		product = director.getProduct();
		System.out.println(product.toString());
		
		
		builder = new SecondBuilder();
		director = new Director(builder);
		director.constructProduct();
		product = director.getProduct();
		System.out.println(product.toString());
	}
}
