package test.mypac;
/*
 *  클래스를 만들어서 우리에게 사용하도록 제공해주는 개발자가 있다고 가정하자 (유틸리티나 프레임워크 공유)
 *  
 *  그 개발자는 특정 메소드를 우리의 상황에 맞게 구현하도록 미완성인 메소드를 제공할 수 있다.
 *  
 *  미완성인 메소드를 추상메소드라고 하며, 추상메소드를 하나 이상 가지고 있는 클래스를
 *  추상클래스라고 한다.
 *  
 *  추상 메소드와 추상 클래스를 만들기 위해서는 abstract 예약어가 필요하다.
 *  
 * */
public abstract class Weapon {
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	
	//공격하는 메소드
	public abstract void attack(/*인자 입력 구역*/); 
	//미완성인 메소드는 abstract, 중괄호 X, 세미콜론으로 마무리
	
	
}
