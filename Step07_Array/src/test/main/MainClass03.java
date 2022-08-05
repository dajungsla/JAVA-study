package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//String type을 담을 수 있는 방 3개짜리 빈 배열객체를 만들어서 참조값을 지역변수 name에 담기
		String[] names=new String[3]; //String[] names={null, null, null};
		names[0]="하오";
		names[1]="다정";
		names[2]="숭이";
		
		//반복문으로 배열에 저장된 문자열을 순서대로 콘솔창에 출력하기
		for(int i=0;i<names.length;i++) {
			//1.
			System.out.println(names[i]+"야~ 안녕!");
			
			//2. tmp변수를 만들어 i번째 방에 저장된 아이템 참조
			String tmp=names[i];
			//출력
			System.out.println(tmp);
		}
	}

}
