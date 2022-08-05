package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[]args) {
		//Random type 참조값이 담길 수 있는 ran이라는 이름의 null값의 지역변수 만들기.
		//지역변수는 stack에 만들어짐.!
		Random ran=null;
		//Random객체를 생성하여 그 참조값을 지역변수 ran에 대입하기
		ran=new Random();
		
		//참조값에 .찍어서 nextInt() 메소드를 호출하고 메소드가 리턴해주는 int값을 지역변수 ranNum에 대입
		int ranNum=ran.nextInt(); //-null값이면,, nextInt로 호출 불가
		System.out.println(ranNum);
	}

}
