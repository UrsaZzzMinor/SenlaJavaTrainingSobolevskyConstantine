package classes;

public class Runner {

	public static void main(String[] args) {
		
		BodyLineStep body = new BodyLineStep();
		EngineLineStep engine = new EngineLineStep();
		TowerLineStep tower = new TowerLineStep();
		AssemblyLine tankAssembly = new AssemblyLine(body, engine, tower);
		Product tank = new Product();
		tankAssembly.assembleProduct(tank);
		
	}

}
