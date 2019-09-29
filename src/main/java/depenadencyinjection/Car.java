package depenadencyinjection;

public class Car {

//	Engine engine;
	//dependency
	Engine engine = new Engine("ford");
	 
//	public Car(Engine engine) {
//		this.engine = engine;
//	}

	public Car() {

	}

	public String viewEngineName() {
		System.out.println(engine.getEngineName());
		return engine.getEngineName();
	}
}
