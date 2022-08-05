package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

public class MainClass06 {
	public static void main(String[] args) {
		//member_seq이라는 시퀀스를 이용하여 아래의 회원정보를 추가한다.
		String name="해골";
		String addr="행신동";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			//DBConnect객체를 이용하여 Connection 객체의 참조값을 얻어온다.
			conn=new DBConnect().getConn();
			System.out.println("Oracle DB 접속 성공");
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
	         pstmt.setString(1, name);
	         pstmt.setString(2, addr);
	         //sql 문 실행하기 
	         pstmt.executeUpdate();
	         System.out.println("회원 정보를 새로 정렬했습니다.");
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	    	  try {
	    		  if(pstmt!=null)pstmt.close();
	    		  if(conn!=null)conn.close();
	    	  }catch(Exception e){
	    	  }
	      }
	      System.out.println("main 메소드가 종료 됩니다.");

	   }
}