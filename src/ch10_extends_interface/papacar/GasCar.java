package ch10_extends_interface.papacar;

public class GasCar implements Vehicle {

	@Override
	public void start() {
		System.out.println("부와아아아앙~~~~~~ ");
	}

	@Override
	public void stop() {
		System.out.println("끼익~~~~~~");
	}

}
