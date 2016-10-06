package classes;

public class Runner {

	public static void main(String[] args) {
		
		TankBody body = new TankBody();
		TankEngine engine = new TankEngine();
		TankTower tower = new TankTower();
		AssemblyLine tankAssembly = new AssemblyLine();
		Product tank = new Product();
		
		LineStep lineStep1 = new LineStep(body);
		tank.installFirstPart(lineStep1.buildProductPart());
		LineStep lineStep2 = new LineStep(engine);
		tank.installSecondPart(lineStep2.buildProductPart());
		LineStep lineStep3 = new LineStep(tower);
		tank.installThirdPart(lineStep3.buildProductPart());
		
		tankAssembly.assembleProduct(tank);
		
	}

}
