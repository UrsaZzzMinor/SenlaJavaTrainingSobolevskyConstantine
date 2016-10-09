package flowers;

public class Rose extends Flower{
	public Rose(Integer price, Integer quantity){
		setName("Rose");
		setPrice(price);
		setQuantity(quantity);
		setTotal(getTotal() + price*quantity);
	}
}
