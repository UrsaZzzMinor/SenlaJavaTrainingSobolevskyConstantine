package classes;

import interfaces.IProduct;
import interfaces.IProductPart;

public class Product implements IProduct{

	@Override
	public void installFirstPart(IProductPart part) {
		System.out.println(part.getName() + " has been installed!");
	}

	@Override
	public void installSecondPart(IProductPart part) {
		System.out.println(part.getName() + " has been installed!");		
	}

	@Override
	public void installThirdPart(IProductPart part) {
		System.out.println(part.getName() + " has been installed!");
	}
	
}
