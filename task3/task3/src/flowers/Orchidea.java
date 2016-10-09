package flowers;

public class Orchidea extends Flower{
	
	public Orchidea(Integer price, Integer quantity){
		this.setName("Orchidea");
		this.setPrice(price);
		this.setQuantity(quantity);
		this.setTotal(getTotal() + price*quantity);
	}

}
