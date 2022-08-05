package test.main;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		//1. MemberDto객체를 3개 생성해서 각각의 객체에 회원의 정보를 담아보세요.
		/*MemberDto mdt1=new MemberDto();
		mdt1.setNum(1);
		mdt1.setName("정다정");
		mdt1.setAddr("인천광역시");
		
		MemberDto mdt2=new MemberDto();
		mdt2.setNum(2);
		mdt2.setName("정하오");
		mdt2.setAddr("인천광역시");
		
		MemberDto mdt3=new MemberDto();
		mdt3.setNum(3);
		mdt3.setName("정다인");
		mdt3.setAddr("평택시");
		*/
		
		MemberDto dto1=new MemberDto(1, "정다정", "인천광역시");
		MemberDto dto2=new MemberDto(2, "정하오", "인천광역시");
		MemberDto dto3=new MemberDto(3, "정다인", "경기도 평택시");
		
		
		//2. MemberDto객체의 참조값 3개를 저장할 수 있는 배열객체를 생성해서
		//   members라는 지역변수에 담아보세요.
		MemberDto[] members=new MemberDto[3];
		
		//3. members배열에 1.에서 생성한 MemberDto객체의 참조값 3개를 순서대로 담아보세요.
		members[0]=dto1;
		members[1]=dto2;
		members[2]=dto3;
		
		//4. 반복문으로 members배열에 담긴 MemberDto객체를 하나씩 참조해서 아래와 같이 출력하세요.
		// 회원정보를 콘솔창에 출력해보세요.
		// 번호 1, 이름 : 김구라, 주소 : 노량진
		System.out.println("회원정보를 콘솔창에 출력해보세요.");
		for(int i=0; i<members.length;i++) {
			System.out.println("번호"+members[i].getNum()+" 이름 : "+members[i].getName()+" 주소 : "+members[i].getAddr());
		}
		
		
	}

}
