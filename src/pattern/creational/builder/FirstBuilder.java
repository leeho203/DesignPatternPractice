package pattern.creational.builder;

public class FirstBuilder implements Builder{

	private Product product;
	
	public FirstBuilder(){
		product = new Product();
	}
	
	@Override
	public void buildName() {
		product.setName("firstProduct");
	}

	@Override
	public void buildType() {
		product.setType("firstType");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
