package test.main;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass09 {
	public static void main(String[] args) {
		HashMap<String, String> dic =new HashMap<>();
		dic.put("house","집");
		dic.put("phone","전화기");
		dic.put("car","차");
		dic.put("pencil","연필");
		dic.put("eraser","지우개");
		
		/*
		 * 검색할 단어를 입력하세요 : house
		 * house의 뜻은 집입니다.
		 * 
		 * house1는 검색 목록에 없습니다.
		 * 
		 * 라고 출력하기 
		 * */
		Scanner scan=new Scanner(System.in);
		System.out.print("검색할 단어를 입력하세요 : ");
		String name=scan.nextLine();

		if(dic.get(name)!=null) {
			System.out.println(name+"의 뜻은 "+dic.get(name)+"입니다.");
		}
		else {
			System.out.println(name+"를 검색할 수 없습니다");
		}
		
		if(dic.containsKey(name)) {
			System.out.println(name+"의 뜻은 "+dic.get(name)+"입니다.");
		}
		else {
			System.out.println(name+"를 검색할 수 없습니다");
		}
		
	}

}
