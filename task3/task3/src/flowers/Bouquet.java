package flowers;

public class Bouquet {
	private Integer bouquetPrice = 0;
	private Integer index = 0;
	private Flower[] bouquetOfFlowers = new Flower[4];

	public Flower[] getBouquetOfFlowers() {
		return bouquetOfFlowers;
	}

	public void addFlowerToBouquet(Flower sortOfFlower) {
		this.bouquetOfFlowers[index] = sortOfFlower;
		index++;
	}
	
	public Integer countBouquetPrice(){
		for (int i=0; i<bouquetOfFlowers.length; i++){
			bouquetPrice += bouquetOfFlowers[i].getPrice()*bouquetOfFlowers[i].getQuantity();
		}
		return bouquetPrice;
	}
}
