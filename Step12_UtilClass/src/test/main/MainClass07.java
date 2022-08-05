package test.main;

import java.util.ArrayList;

import test.mypac.Member;

public class MainClass07 {
	/*
	 * 1. Member객체를 담을 수 있는 ArrayList객체를 생성해서 참조값을 members라는 지역변수에 담기
	 * 2. 3명의 회원정보를 Member 객체에 담기
	 * 3. 위에서 생성된 Member 객체의 참조값을 members ArrayList 객체에 모두 담기
	 * 
	 * 4. members ArrayList 객체의 내용 반복문으로 출력 (번호 : 1, 이름 : 정다정, 주소 : 노량진)
	 * */
	public static void main(String[] args) {
		ArrayList<Member> members=new ArrayList<Member>();
		
		Member mem1=new Member(1,"정다정","인천광역시");
		Member mem2=new Member(2,"하오","서울특별시");
		Member mem3=new Member(3,"은혜","경기도 안산시");
		
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
		
		for(int i=0; i<members.size(); i++) {
			Member mem=members.get(i);
			System.out.println("번호 : "+mem.num+" /이름 : "+mem.name+" /주소 : "+mem.addr);
		};
		
	}
	

}
