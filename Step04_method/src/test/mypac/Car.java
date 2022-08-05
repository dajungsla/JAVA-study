package test.mypac;

public class Car {
	
	//생성자 (객체 생성시, new할 때 호출 되는 부분)
	public Car(){ //클래스명()
		System.out.println("Car생성자 호출됨~!");
	}
	//non static 메소드
	public void drive() {
		System.out.println("달려요!");
	}

}
