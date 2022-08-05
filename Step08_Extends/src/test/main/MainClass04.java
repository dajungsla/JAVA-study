package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		//SmartPhone객체를 생성하여 Phone type p1이라는 지역변수에 담아보세요.
		Phone p1=new SmartPhone();
		HandPhone p2=(HandPhone)p1; //Hand phone type으로 캐스팅하는 법
		SmartPhone p3=(SmartPhone)p1;
		
		p1.call();
		p2.mobileCall();
		p3.doInternet();
		
		//CASTING : 적절한 type으로 캐스팅만 잘 하면 method 사용에 불편 X
		//super class(부모타입)로 쓰면 프로그래밍이 유연해짐
		
		//p1에 들어있는 참조값을 이용하여 이동중에 전화를 걸고 싶다면? (mobileCall)
		p2.mobileCall();
		
		//p1에 들어있는 참조값을 이용하여 인터넷을 하고 싶다면? (DoInternet)
		p3.doInternet();
		
		
	}

}
