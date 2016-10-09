package classes;

import interfaces.IAssemblyLine;
import interfaces.IProduct;

public class AssemblyLine implements IAssemblyLine{
	
	private BodyLineStep bodyls;
	private EngineLineStep enginels;
	private TowerLineStep towerls;
	
	public AssemblyLine(BodyLineStep ls1, EngineLineStep ls2, TowerLineStep ls3){
		this.bodyls = ls1;
		this.enginels = ls2;
		this.towerls = ls3;
	}
	@Override
	public IProduct assembleProduct(IProduct product) {
		product.installFirstPart(bodyls.buildProductPart());
		product.installSecondPart(enginels.buildProductPart());
		product.installThirdPart(towerls.buildProductPart());
		System.out.println("The assembly of a tank is completed!");		
		return product;
	}

}
