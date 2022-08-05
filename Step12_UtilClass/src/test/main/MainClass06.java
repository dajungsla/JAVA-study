package test.main;

import java.util.ArrayList;
import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * 1. Car type을 저장할 수 있는 ArrayList 객체를 생성하여, 참조값을 List인터페이스 type
		 *    지역변수 Cars에 담아보세요.
		 *    
		 * 2. Car 객체(3개)를 생성해서 List 객체에 저장해보세요.
		 * 
		 * 3. 반복문 for를 이용하여 List 객체에 저장된 모든 Car객체의 drive() 메소드를 순서대로
		 *    호출해보세요.
		 * */
		
		ArrayList<Car> cars=new ArrayList<Car>();
		
		cars.add(new Car("Porsche"));
		cars.add(new Car("Audi"));
		cars.add(new Car("Genesis"));


		for(int i=0; i<cars.size();i++) {
			cars.get(i).drive();
		}
		/*
		 * 확장 for문, Car type의 tmp객체 생성하여 cars의 배열 순서대로 호출
		 * for(Car tmp:cars){
		 * 		tmp.drive();
		 * }
		 * 
		 * */
	}

}
