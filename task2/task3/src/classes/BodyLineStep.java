package classes;

import interfaces.ILineStep;
import interfaces.IProductPart;

public class BodyLineStep implements ILineStep{
	TankBody body = new TankBody();
	
	private IProductPart part;
	
	public BodyLineStep(){
		this.part = body;
	}

	@Override
	public IProductPart buildProductPart() {
		System.out.println(part.getName() + " is ready to be installed");
		return part;
	}

}
