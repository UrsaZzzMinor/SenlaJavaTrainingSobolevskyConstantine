package classes;

import interfaces.IProductPart;

public class TankEngine implements IProductPart{
	
	private String part = "Engine of a tank";

	@Override
	public String getName() {
		return part;
	}
	
}
