package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1=new HandPhone(); // 핸드폰 객체를 생성하여 핸드폰 타입으로 받음
		//엄마 나도 SmartPhone 사주세요
		SmartPhone p2=(SmartPhone)p1; // class casting exception
		//이제 인터넷한다!
		p2.doInternet(); // Run하면 안됨.
	}
}
