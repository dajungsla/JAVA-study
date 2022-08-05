package test.main;

import test.auto.CampingCar;
import test.auto.Engine;

public class testCampingCar {
	public static void main(String[] args) {
		CampingCar cc=new CampingCar(new Engine());
		
		cc.drive();
		cc.travel();
		cc.washAndCook();
	}

}
