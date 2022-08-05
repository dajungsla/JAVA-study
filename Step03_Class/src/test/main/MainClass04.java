package test.main;

import test.mypac.MyUtil;

public class MainClass04 {
	public static void main(String[]args) {
		/*
		 * myUtil클래스에 있는 send()메소드를 호출하고 싶다면?
		 * 
		 * static메소드이기 때문에, new하지 않고
		 * import후에 클래스 명에.을 찍어서 호출할 수 있다.
		 * */
		//static메소드 호출
		MyUtil.send();
		//static 필드 참조
		String v=MyUtil.version;
	}

}
