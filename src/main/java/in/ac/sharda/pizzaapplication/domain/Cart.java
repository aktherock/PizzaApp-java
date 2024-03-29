package in.ac.sharda.pizzaapplication.domain;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Cart {
private final int id;

	private static final Cart instance = new Cart(1);

	private Set<Product> products
		= new TreeSet<>();
	
	private Cart(int id) {
		
		this.id = id;
	}

	private Cart(int id, Set<Product> products) {
		
		this.id = id;
		this.products = products;
	}
	
	public static Cart getInstance(){
		return instance;
	}
	
	public Set<Product> getProducts() {
		return products;
	}
	
	public void addProduct(Product product){
		this.products.add(product);
	}
	
	public void removeProduct(Product product){
		this.products.remove(product);
	}
	@Override
		public boolean equals(Object obj) {
			if(obj != null && obj instanceof Cart){
				Cart c = (Cart)obj;
				return c.id == id;
			}
			return false;
		}
}
