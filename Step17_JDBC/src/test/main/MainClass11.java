package test.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		int num=15;
		
		//지역변수num에 담긴 내용을 메소드의 인자로 전달하여 회원 한명의 정보를 얻어낸다.
		MemberDto dto=getData(num);
		if(dto==null) {
			System.out.println(num+"번 회원 정보는 존재하지 않습니다.");
		}else {
			System.out.println(num+"번 회원의 이름은 "+dto.getName()+"이며, 주소는 "+
								dto.getAddr()+"입니다.");
		}
		
	}
	
	//인자로 전달되는 번호에 해당되는 회원 한 명의 정보를 리턴하는 메소드(memberDto, Map)
	public static MemberDto getData(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MemberDto dto=null;
		
		try {
			conn=new DBConnect().getConn();
			String sql="SELECT name, addr"
					+ " From member"
					+ " Where num=?";
			pstmt=conn.prepareStatement(sql);
			//?에 바인딩 할 내용
			pstmt.setInt(1, num);
			//select문 수행하고 결과를 ResultSet으로 얻어내기
			rs=pstmt.executeQuery();
			//primary key로 select를 하게 되면, select된 row는 최대 1개이므로
			//cursor 를 반복문 돌면서 여러번 내릴 필요가 없다.
			//즉 rs.next()는 한 번만 수행되면 된다.
			if(rs.next()) {
			//커서가 위치한 곳에서 select된 칼럼 정보를 얻어낸다.
			String name=rs.getString("name");
			String addr=rs.getString("addr");
			//rs.next()는 boolean이므로 true일 경우에만 위 두줄의 코드 수행'
			
			//Select된 정보를 MemberDto객체를 생성해서 저장해야함.
			dto=new MemberDto();
			dto.setNum(num);
			dto.setName(name);
			dto.setAddr(addr);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		//select된 row가 없다면 dto는 null
		return dto;
	}

}
