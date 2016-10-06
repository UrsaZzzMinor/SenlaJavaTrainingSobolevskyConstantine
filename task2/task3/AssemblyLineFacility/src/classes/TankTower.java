package classes;

import interfaces.IProductPart;

public class TankTower implements IProductPart{
	
	private String part = "Tower of a tank";

	@Override
	public String getName() {
		return part;
	}

}
