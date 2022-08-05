package test.main;

import test.mypac.Messenger;
import test.mypac.Radio;

public class MainClass05 {
	public static void main(String[] args) {
		//Messenger class의 sendMessage(), getMessage(), useRadio() 메소드를 호출
		//static method는 new하지 않고 바로 사용
		Messenger.sendMessage("hihih~");
		String a=Messenger.getMessage();
		Messenger.useRadio(new Radio());

		
	}

}
