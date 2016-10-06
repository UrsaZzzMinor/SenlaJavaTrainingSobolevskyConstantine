package classes;

import interfaces.IProductPart;

public class TankBody implements IProductPart{
	
	private String part = "Body of a tank";

	@Override
	public String getName() {
		return part;
	}
	
	
}
