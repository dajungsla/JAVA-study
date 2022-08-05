package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		/* Scanner 객체를 이용하여 반복문으로 친구 이름을 3번 입력받고
		 * 입력받은 이름을 ArrayList객체에 순서대로 저장하는 프로그래밍*/
		Scanner scan=new Scanner(System.in);
		ArrayList<String> friends=new ArrayList<String>();
		
		for(int i=0; i<3; i++) {
			System.out.print("친구 이름 입력 : ");
			String name=scan.nextLine();
			friends.add(name);
		}
		
		//저장된 내용 출력하기
		for(String tmp:friends) {//확장 for문
			System.out.println(tmp);
		}
	}
}
