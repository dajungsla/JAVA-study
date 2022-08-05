package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 회원정보는 숫자(int), 문자(String)으로 구성되어 있어
		 * Value의 generic은 Object
		 * */
		Map<String, Object> map= new HashMap<>();
		//value의 generic이 Object이기 때문에 어떤 type이든 담을 수 있다.
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		
		//Object type으로 리턴되기 때문에 원래 type으로 Casting
		int num=(int)map.get("num");
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
	}
}
