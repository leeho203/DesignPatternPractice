package pattern.creational.builder;

public class SecondBuilder implements Builder{

	private Product product;
	
	public SecondBuilder(){
		product = new Product();
	}
	
	@Override
	public void buildName() {
		product.setName("secondProduct");
	}

	@Override
	public void buildType() {
		product.setType("secondType");
	}

	@Override
	public Product getProduct() {
		return product;
	}	
}
