package assignment6;

class Engine {
	public void startCar() {
		System.out.println("Car engine starts");
	}

	public void stopCar() {
		System.out.println("Car engine stop");
	}

	public void display() {
		System.out.println("Fiat twin air engine is displayed.");
	}

}

public class Car {

	public static void main(String[] args) {
		Engine obj = new Engine();
		obj.startCar();
		obj.stopCar();
		obj.display();
	}

}
