package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	/*
	 * Weapon 추상 클래스를 상속받은 inner class
	 * 
	 * main()메소드는 static메소드이기 때문에, main 메소드에서 사용하려면
	 * inner class도 static영역에 있어야 하므로, static예약어를 사용한다.
	 * */
	static class Gun extends Weapon{
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("총을 쏴요");
		}
	}
	
	public static void main(String[] args) {
		Weapon w1=new Gun();
		useWeapon(w1);
		//local inner class
		class Missile extends Weapon{
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("미사일 공격");
			}
		}
		Weapon w2=new Missile();
		useWeapon(w2);
		
		//객체를 생성하지 않고, 바로 useWeapon() 메소드 호출
		useWeapon(new Missile());
		
	}

	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();

	}
}
