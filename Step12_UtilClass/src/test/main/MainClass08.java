package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		/* 1. MemberDto 객체를 담을 수 있는 ArrayList 객체를 생성해서 
		*     참조값을 members라는 지역변수에 담기
		*  2. 3명의 회원정보를 MemberDto객체에 각각 담기
		*  3. 위에서 생성된 MemberDto객체의 참조값을 ArrayList객체에 담기
		*  4. ArrayList 객체에 담긴 내용을 이용하여 회원목록을 아래와 같은 형식으로
		*     반복문 돌면서 출력 (번호 : 1, 이름 : 김구라, 주소 : 노량진)
		*/
		
		List<MemberDto> members=new ArrayList<MemberDto>();
		
		MemberDto dto1=new MemberDto();
		dto1.setNum(1);
		dto1.setName("하오");
		dto1.setAddr("인천");
		
		MemberDto dto2=new MemberDto(2, "다정", "인천");
		MemberDto dto3=new MemberDto(3, "감자","서울");
		
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		for(int i=0; i<members.size(); i++) {
			MemberDto tmp=members.get(i);
			System.out.println("번호 : "+tmp.getNum()+" /이름 : "+tmp.getName()+" /주소 : "+tmp.getAddr());
		};
		
		
		
	}

}
