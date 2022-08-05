package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject클래스에 정의된 3개의 메소드를 차례로 호출하는 code 작성
		//non static의 참조값을 가져오는 것이 관건!!
		
		//walk(), getNumber(),getGreeting() 은 non static
		//new MyObject()해서 객체를 생성한 후에 참조값에 . 을 찍어서 메소드 호출
		
	   MyObject obj=new MyObject();
	   obj.walk(); //리턴타입이 없는 메소드 호출
	   int a=obj.getNumber(); //리턴타입이 있는 메소드 호출
	   String b=obj.getGreeting();
		
	}
}
