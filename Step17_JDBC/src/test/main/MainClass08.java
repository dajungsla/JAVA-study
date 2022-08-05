package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		String name="덩어리";
		String addr="상도동";
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("addr", addr);

		insert(map);
	}
	//인자로 전달받은 Map객체에 있는 회원정보를 DB에 저장하는 메소드
	public static void insert(Map<String,String> map) {
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
	         pstmt.setString(1, map.get("name"));
	         pstmt.setString(2, map.get("addr"));
	         //sql 문 실행하기 
	         pstmt.executeUpdate();
	         System.out.println("회원 정보를 새로 추가했습니다.");
	      }catch(Exception e) {
	         e.printStackTrace();
	      } finally {
	          try {
	             if(pstmt!=null)pstmt.close();
	             if(conn!=null)conn.close();
	          } catch (SQLException e) {
	             e.printStackTrace();
	          }
	       }
	    }
	 }