package classes;

import interfaces.IAssemblyLine;
import interfaces.IProduct;

public class AssemblyLine implements IAssemblyLine{
	@Override
	public IProduct assembleProduct(IProduct product) {
		/*
		LineStep lineStep1 = new LineStep(new TankBody());
		product.installFirstPart(lineStep1.buildProductPart());
		LineStep lineStep2 = new LineStep(new TankEngine());
		product.installSecondPart(lineStep2.buildProductPart());
		LineStep lineStep3 = new LineStep(new TankTower());
		product.installThirdPart(lineStep3.buildProductPart());
		*/
		System.out.println("The assembly of a tank is completed!");		
		return product;
	}

}
