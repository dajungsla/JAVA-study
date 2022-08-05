package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		/* ArrayList 객체에 친구 5명의 이름을 넣고
		 * 반복문을 돌면서 친구 이름을 아래의 형태로 출력
		 * 0번째 친구 : 000*/
		ArrayList<String> friends=new ArrayList<String>();
		friends.add("하오");
		friends.add("은혜");
		friends.add("소윤");
		friends.add("성문");
		friends.add("대현");
		
		for(int i=0; i<friends.size(); i++) {
			String str=friends.get(i);
			System.out.println((i+1)+"번 째 친구 : "+str);
		}
	}
}
