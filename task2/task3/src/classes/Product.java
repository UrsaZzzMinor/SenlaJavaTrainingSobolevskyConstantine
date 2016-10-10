package classes;

import interfaces.IProduct;
import interfaces.IProductPart;

public class Product implements IProduct{
	
	TankBody bodyProd = new TankBody();
	TankEngine engineProd = new TankEngine();
	TankTower towerProd = new TankTower();
	
	@Override
	public void installFirstPart(IProductPart part) {
		this.bodyProd = (TankBody) part;
		System.out.println(part.getName() + " has been installed!");
	}

	@Override
	public void installSecondPart(IProductPart part) {
		this.engineProd = (TankEngine) part;
		System.out.println(part.getName() + " has been installed!");		
	}

	@Override
	public void installThirdPart(IProductPart part) {
		this.towerProd = (TankTower) part;
		System.out.println(part.getName() + " has been installed!");
	}
	
}
