package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		//Car객체의 참조값을 얻어내서 drive()메소드를 여기서 호출
		new MyObject().getCar().drive();
		//위의 한 줄은 아래처럼 풀어서 쓸 수 있다.
		MyObject obj=new MyObject();
		Car car1=obj.getCar();
		car1.drive();
	}

}
