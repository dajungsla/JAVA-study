package test.main;

import java.util.Random;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//디버깅 모드로 실행하여, m1 m2 m3를 확인해보세요
		Member m1=new Member(1,"김구라","노량진");
		Member m2=new Member(2,"김해골","행신동");
		Member m3=new Member(3,"원숭이","상도동");
		//default 생성자를 이용해서 객체를 생성하면 field에는 기본값이 들어있다.
		Member m4=new Member(); //필드에 값이 없는 생성자
		
	}

}
