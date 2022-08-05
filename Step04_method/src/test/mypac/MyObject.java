package test.mypac;
/*
 * 메소드를 만들 때 고려해야 하는 것
 * 1. 접근 지정자
 * 2. static or non static
 * 3. 리턴 type
 * 4. 메소드 명
 * 5. 메소드에 전달하는 인자의 갯수와 데이터 type
 * */

public class MyObject {
	/*
	 * public : 이 메소드는 어디에서든 접근 가능하다
	 * void : 이 메소드는 어떤 값도 리턴하지 않는다.
	 * walk : 메소드 명
	 * walk() : 이 메소드는 어떤 값도 인자로 전달받지 않는다.
	 * */
	
	public void walk() {//리턴타입 void
		System.out.println("걸음을 걸어요.");
	}
	//int를 리턴해주는 메소드
	public int getNumber() {
		return 10;
	}
	//String type을 리턴해주는 메소드
	public String getGreeting() {
		return "안녕하세요~!";
	}
	//Car type을 리턴해주는 메소드
	public Car getCar() {
		return new Car();
	}
	//int type을 메소드의 인자로 전달받는 메소드
	public void setNum(int num) {
		System.out.println("num:"+num);
	}
	//String type을 메소드의 인자로 전달받는 메소드
	public void setName(String name) {
		System.out.println("name:"+name);
	}
	//Radio type을 메소드의 인자로 전달받는 메소드
	public void useRadio(Radio r) {
		r.listenMusic();	
	}
	//Gun type과 Arrow type을 메소드의 인자로 전달받는 메소드
	public void attack(Gun g, Arrow a) {
		System.out.println("총과 활로 공격해요");
	}

}
