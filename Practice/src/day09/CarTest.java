package day09;

public class CarTest {

	public static void main(String[] args) {
		// d9 클래스 만들기 car test
		Car car = new Car();
		car.printCar();
		car.turnOn();
		car.printCar();
		car.setGear('D');
		for(int i=1; i<=50; i++)car.accCar();
		car.printCar();
		car.turnOff();
		car.printCar();
	}

}
