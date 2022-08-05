package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		
		//InputStream객체는 1byte 단위 처리 스트림이다.
		// 영문자, 대소문자, 숫자, 특수문자만 처리 가능하다.(한글은 처리 불가.)
		
		//keyboard와 연결된 InputStream type의 참조값을 keyboard라는 지역변수에 담기
		InputStream keyboard=System.in;
		System.out.println("입력 :");
		try {
			//입력한 문자의 코드갑을 읽음
			int a=keyboard.read();
			System.out.println("code:"+a);
			//코드 값에 대응되는 문자 얻어내기
			
			char ch=(char)a;
			System.out.println("char:"+ch);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
