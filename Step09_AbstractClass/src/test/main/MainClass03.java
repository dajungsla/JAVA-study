package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		//1. Zoo객체를 생성해서 참조값 z라는 지역변수에 담아보세요.
		Zoo z=new Zoo();
		//2. z 안에 있는 참조값을 이용하여 getMonkey()메소드를 호출하여 
		//   리턴되는 값을 m1이라는 지역변수에 담아보세요.
		Monkey m1=z.getMonkey();
		//3. m1안에 있는 참조값을 이용해서 say()메소드를 호출해보세요.
		m1.say();
		
		//Zoo 클래스에 있는 getTiger() 메소드를 호출하여 리턴되는 값을 t1이라는 지역변수에 담아보세요.
		Tiger t1=z.getTiger();
		//t1에 있는 참조값을 이용하여 say()메소드를 호출해보세요.
		t1.say();
		//타이거 import없이 지역변수 만드는 법
		test.mypac.Zoo.Tiger t2=z.getTiger(); 
		
		//메소드 안에서 클래스 정의 가능, 해당 메소드 안에서만 사용 가능.
		class Gura{
			public void say() {
				System.out.println("안녕 나는 구라");
			}
		}
		Gura gr=new Gura();
		gr.say();
	}
}
