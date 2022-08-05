package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * emp테이블의 사원번호, 사원이름, 부서번호, 급여를 급여 내림차순으로 정렬하여 콘솔창 출력
		 * */
		//DB 연결객체를 담을 지역 변수 만들기
	    Connection conn=null;
		
		try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      //SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기 
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      try {
	         //실행할 미완성의 sql 문
	    	  String sql="SELECT empno,ename,deptno,sal From emp"
	    			  + " ORDER BY sal ASC";
	         //PreparedStatement 객체의 참조값 얻어오기
	         pstmt=conn.prepareStatement(sql);
	         rs=pstmt.executeQuery();
	         System.out.println("회원 정보를 새로 정렬했습니다.");
	         while(rs.next()) {
	    		  int empno=rs.getInt("empno");
	    		  String ename=rs.getString("ename");
	    		  int deptno=rs.getInt("deptno");
	    		  int sal=rs.getInt("sal");
	    		  //콘솔창에 출력하기
	    		  System.out.println(empno+" | "+ename+" | "+deptno+" | "+sal);
	    	  }
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      
	      System.out.println("main 메소드가 종료 됩니다.");
	      
	   }
	}