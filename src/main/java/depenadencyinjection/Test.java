package depenadencyinjection;

public class Test {

	public static void main(String[] args) {
		System.out.println("hello dependancy check");

		Engine engine = new Engine("suzaki");
		Engine engine1 = new Engine("honda");
		Engine engine2 = new Engine("GE");
		
		Car car = new Car();
		Car car1 = new Car();
		Car car2 = new Car();

//		Car car = new Car(engine);
//		Car car1 = new Car(engine1);
//		Car car2 = new Car(engine2);
		
		car.viewEngineName();
		car1.viewEngineName();
		car2.viewEngineName();

	}

}
