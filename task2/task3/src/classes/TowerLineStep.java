package classes;

import interfaces.ILineStep;
import interfaces.IProductPart;

public class TowerLineStep implements ILineStep{
	TankTower tower = new TankTower();
	
	private IProductPart part;
	
	public TowerLineStep(){
		this.part = tower;
	}

	@Override
	public IProductPart buildProductPart() {
		System.out.println(part.getName() + " is ready to be installed");
		return part;
	}

}
