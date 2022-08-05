package test.main;

import test.mypac.Remocon;

public class MainClass02 {
	//이너클래스(Remocon 인터페이스를 구현한 inner class)
	static class YourRemocon implements Remocon{

		@Override
		public void up() {
			// TODO Auto-generated method stub
			System.out.println("볼륨을 올려요");
		}

		@Override
		public void down() {
			// TODO Auto-generated method stub
			System.out.println("볼륨을 내려요");
		}
		
	}
	
	public static void main(String[] args) {
		//전역 내부 클래스
		YourRemocon yr=new YourRemocon();
		useRemocon(yr);
		
	}
	//Remocon 인터페이스 type을 인자로 전달받는 static메소드
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
