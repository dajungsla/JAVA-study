package test.main;
/*
 * [ 기본 data type의 참조 data type ]
 * byte : Byte
 * short : Short
 * int : Integer
 * long : Long
 * 
 * float : Float
 * double : Double
 * 
 * char : Character
 * boolean : Boolean
 * 
 * - 때로는 기본 데이터 타입의 참조 데이터 타입이 필요할 때가 있다.
 * - 기본 데이터 타입을 객체에 포장(boxing)하는 형태이다.
 * - boxing과 unboxing은 자동으로 되기때문에 프로그래머가 신경 쓸 필요가 없다.
 * */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main메소드가 시작되었습니다.");
		int num1=10;
		Integer num2=10;
		
		//참조 데이터type이지만 기본 데이터type처럼 사용할 수 있다.
		int result1=num2=1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		
		//문자를 숫자로 바꾸기
		String strNum="999";
		//result4는 999
		int result4=Integer.parseInt(strNum);

	}
}
