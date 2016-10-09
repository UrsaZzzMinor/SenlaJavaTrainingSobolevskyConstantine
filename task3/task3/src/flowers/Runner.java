package flowers;

public class Runner {

	public static void main(String[] args) {
		
		Daisy daisy = new Daisy(5, 2);
		Rose rose = new Rose(10, 1);
		Tulip tulip = new Tulip(7, 3);
		Orchidea orchidea = new Orchidea(15, 5);
		System.out.println("Total cost of picked flowers = " + Flower.getTotal());

	}

}
