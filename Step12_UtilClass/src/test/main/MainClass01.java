package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		//"김구라", "해골", "원숭이" 3개의 string type을 저장해보세요.
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		//o번 index의 아이템을 불러와서 item이라는 변수에 담아보세요.
		String item=names.get(0);
		
		//1번 index의 아이템 삭제 - array의 item이 두 개가 됨.
		names.remove(1);
		
		//0번 index에 "에이콘"을 입력하려면?
		names.set(0, "에이콘");
		
		//저장된 아이템의 갯수(size)를 size라는 지역변수에 담아보세요.
		int size=names.size();
		
		//저장된 모든 아이템 전체 삭제
		names.clear();
	}
}
