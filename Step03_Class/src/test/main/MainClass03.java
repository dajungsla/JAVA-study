package test.main;

import test.mypac.Member;

public class MainClass03 {
	public static void main(String[]args) {
		System.out.println("main메소드가 시작되었습니다.");
		//Member 객체를 생성해서 그 참조값을 mem1이라는 지역변수에 담아보세요.
		Member mem1=new Member();
		mem1.num=1;
		mem1.name="김구라";
		mem1.addr="노량진";
		
		//Member객체를 생성해서 그 참조값을 mem2이라는 지역변수에 담아보세요.
		Member mem2=new Member();
		mem2.num=2;
		mem2.name="해골";
		mem2.addr="행신동";
		
		//mem1, mem2에 들어있는 참조값을 이용하여 showInfo()메소드 호출하기
		mem1.showInfo();
		mem2.showInfo();
	}

}
