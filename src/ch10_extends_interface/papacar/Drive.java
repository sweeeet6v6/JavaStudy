package ch10_extends_interface.papacar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Drive {

	public static void main(String[] args) {
		Vehicle car1 = new ElectricCar();
		Vehicle car2 = new GasCar();
		
		// 동일한 인터페이스를 구현했기 때문에 동일한 메서드가 있음
		car1.start();
		car2.start();
		
		// 동일한 인터페이스로 구현되어 제네릭이 같은 타입으로 가용 가능
		ArrayList<Vehicle> cars = new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		
		System.out.println(cars);
		
		List list = new ArrayList<>();
		List list2 = new LinkedList<>();
		list.add("hi");
		list2.add("hello");
		
	}

}
