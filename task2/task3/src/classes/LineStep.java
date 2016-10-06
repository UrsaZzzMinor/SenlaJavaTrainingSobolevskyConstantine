package classes;

import interfaces.ILineStep;
import interfaces.IProductPart;

public class LineStep implements ILineStep{
	
	private IProductPart part;
	
	public LineStep(IProductPart part){
		this.part = part;
	}

	@Override
	public IProductPart buildProductPart() {
		System.out.println(part.getName() + " is ready to be installed");
		return part;
	}

}
