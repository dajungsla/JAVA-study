package test.main;

import test.mypac.MainAttack;
import test.mypac.Weapon;

public class MainClass02 {
	
	public static void main(String[] args) {
		Weapon w1=new MainAttack();
		MainClass02.useWeapon(w1); 
		//Mainattack에서 오버라이드하여 만든 메소드 참조 
		
		/*직접 클래스를 만들고 객체생성을 하여, 아래의 useWeapon()메소드를 호출
		 * 클래스 명도 맘대로, attack 메소드 안에서 어떤 동작을 할 지도 맘대로
		 * 테스투 후 작성한 클래스와 main() 메소드를 전송*/
		
	}
	//이 메소드는 미리 준비된 메소드이고, 아주 특별한 동작을 하는 메소드라고 가정
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		System.out.println("잠시 휴식 중입니다...");
		w.attack();
		
	}

}
