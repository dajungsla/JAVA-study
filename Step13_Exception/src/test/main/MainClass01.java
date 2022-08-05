package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		//숫자 형식의 문자열을 입력 받는다.
		String inputNum=scan.nextLine();
		
		//예외가 발생할 수 있는 구간에 try catch
		try {//입력한 숫자를(문자열) 실제 숫자로 바꾼다.
			double num=Double.parseDouble(inputNum);
			//입력한 숫자에 100을 더한다.
			double result=num+100;
			System.out.println("입력한 숫자 + 100 : "+result);
			System.out.println("100을 더하는 작업을 완료했습니다.");
		}
		catch(NumberFormatException nfe) {
			System.out.println("작업이 실패했습니다.");
			System.out.println(nfe.getMessage());
			//콘솔에 자세한 경고메세지 출력
			nfe.printStackTrace();
		}
	}

}
