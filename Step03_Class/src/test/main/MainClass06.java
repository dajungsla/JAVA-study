package test.main;

import java.io.PrintStream;

public class MainClass06 {
	
	public static void main(String[] args) {
		/*
		 * System 클래스의 out이라는 Static 필드에 담긴 참조값을
		 * PrintStream type 지역 변수에 담기
		 * 지역변수에 담긴 참조값에 .을 찍어서 println()메소드를 호출하여 콘솔창에 문자 출력
		 * */
		PrintStream a=System.out;
		a.println("hi!!");
	}
}