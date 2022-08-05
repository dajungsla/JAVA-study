package test.main;

import java.util.ArrayList;

public class MainClass05 {
	public static void main(String[] args) {
		// ArrayList는 기본 데이터 type을 저장할 수 없으므로
		// 기본 데이터 type을 저장하고 싶으면  Wrapper Class를 사용하면 된다.
		/*
		 * int > Integer
		 * double > Double
		 * boolean > Boolean 등
		 * */
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//확장 for 문을 이용하여, 저장된 정수를 순서대로 콘솔창에 출력하기
		for(Integer tmp:nums) {
			System.out.println(tmp);
		}
	
	}

}
