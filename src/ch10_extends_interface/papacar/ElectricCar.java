package ch10_extends_interface.papacar;

public class ElectricCar implements Vehicle {

	@Override
	public void start() {
		System.out.println("위잉,, 이잉,, ~~");
	}

	@Override
	public void stop() {
		System.out.println("---");
	}

}
