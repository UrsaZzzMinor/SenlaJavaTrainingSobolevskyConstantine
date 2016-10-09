package classes;

import interfaces.ILineStep;
import interfaces.IProductPart;

public class EngineLineStep implements ILineStep{
	TankEngine engine = new TankEngine();
	
	private IProductPart part;
	
	public EngineLineStep(){
		this.part = engine;
	}

	@Override
	public IProductPart buildProductPart() {
		System.out.println(part.getName() + " is ready to be installed");
		return part;
	}

}
