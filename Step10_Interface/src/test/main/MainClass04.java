package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {

			@Override
			public void hole() {
				// TODO Auto-generated method stub
				System.out.println("벽에 구멍 뚫기");
			}
		});
		
		
		useDrill(()->{
			System.out.println("바닥에 구멍뚫기");
		});
		
		Drill d2=()->{
			System.out.println("이게 머야 구멍 뚫기");
		};
		//Drill type을 메소드의 인자로 전달
		useDrill(d2);
		//Drill type의 메소드 직접 호출
		d2.hole();
		
		
		
	}
	
	
	//Drill 인터페이스 type을 인자로 전달받는 메소드
	public static void useDrill(Drill d) {
		d.hole();
	}
}
