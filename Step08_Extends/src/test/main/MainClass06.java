package test.main;

import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		SmartPhone p1=new SmartPhone();
		p1.mobileCall();
		p1.doInternet();
		p1.takePicture();
		//override, 특정기능 재정의하고 싶을 때
	}

}
