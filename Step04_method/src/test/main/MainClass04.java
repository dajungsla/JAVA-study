package test.main;

import test.mypac.Arrow;
import test.mypac.Gun;
import test.mypac.MyObject;
import test.mypac.Radio;

public class MainClass04 {
	public static void main(String[] args) {
		MyObject obj=new MyObject();
		obj.setNum(999);
		obj.setName("kim");
		
		//useRadio()메소드 호출하여 즉석에서 데이터 만들어 전달
		obj.useRadio(new Radio());
		
		//메소드의 인자로 전달할 값이 이미 준비되어 있을 수 있음.
		//이미 준비되어 있다면, 메소드 호출하면서 준비된 값을 참조해서 전달.
		Radio r1=new Radio();
		obj.useRadio(r1);
		
		//attack()메소드 호출
		obj.attack(new Gun(), new Arrow());

	}

}
