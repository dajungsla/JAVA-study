package test.main;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass14 {
	public static void main(String[] args) {
		//HashSet 객체를 생성해서 참조값을 Set인터페이스 type으로 담기
		HashSet<String> names=new HashSet<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주뎅이");
		names.add("덩어리");
		
		//반복자(Iterator)객체 얻어내기 (저장된 item을 일렬로 세웠다고 생각하기)
		Iterator<String>it=names.iterator();
		
		//cursor다음에 item이 있는 동안에만 반복문
		while(it.hasNext()) {
			//cursor를 다음칸으로 이동시켜 커서가 위치한 곳의 item읽기
			String item=it.next();
			System.out.println(item);
		}
		
		//특정 item(데이터, 참조값) 존재 여부 알아내기
		boolean isContain=names.contains("김구라");
		//저장된 item의 갯수
		int size=names.size();
		//특정 item삭제
		names.remove("해골");
		//모든 아이템 삭제
		names.clear();
	}

}
