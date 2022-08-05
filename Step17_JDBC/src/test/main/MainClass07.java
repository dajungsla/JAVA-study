package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		//member 테이블에 추가할 회원의 정보
		String name="하오";
		String addr="대구";
		
		//회원 한명의 정보를 MemberDto 객체에 담고
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		//메소드 호출하면서 MemberDto객체를 전달한다.
		insert(dto);
	}
	
	
	//회원 한 명의 정보를 추가하는 메소드(static메소드에서 바로 호출하기 위해 static메소드로 만들기)
	public static void insert(MemberDto dto) {
		//MemberDto객체에 담긴 회원정보를 DB에 저장하는 작업을 해보세요.
		//(시퀀스 사용해야함)
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			//DBConnect객체를 이용하여 Connection 객체의 참조값을 얻어온다.
			conn=new DBConnect().getConn();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      try {
	         //실행할 미완성의 sql 문
	         String sql="INSERT INTO member"
	        	   +" (num,name,addr)"
	        	   +" VALUES(MEMBER_SEQ.NEXTVAL, ?,?)";
	         //PreparedStatement 객체의 참조값 얻어오기
	         pstmt=conn.prepareStatement(sql);
	         //sql 문 완성하기 
	         pstmt.setString(1, dto.getName());
	         pstmt.setString(2, dto.getAddr());
	         //sql 문 실행하기 
	         pstmt.executeUpdate();
	         System.out.println("회원 정보를 새로 정렬했습니다.");
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	}
}
