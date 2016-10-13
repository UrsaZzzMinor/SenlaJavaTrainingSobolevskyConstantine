package flowers;

public class Runner {

	public static void main(String[] args) {
		Bouquet bouquet = new Bouquet();
		Daisy daisy = new Daisy(5, 2);
		Rose rose = new Rose(10, 1);
		Tulip tulip = new Tulip(7, 3);
		Orchidea orchidea = new Orchidea(15, 5);
		bouquet.addFlowerToBouquet(daisy);
		bouquet.addFlowerToBouquet(rose);
		bouquet.addFlowerToBouquet(tulip);
		bouquet.addFlowerToBouquet(orchidea);
		System.out.printf("Total cost of picked flowers = %d%n", bouquet.countBouquetPrice());

	}

}
