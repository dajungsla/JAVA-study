package test.main;

public class MainClass05 {
	public static int num=999;
	
	public static void main(String[]args) {
		System.out.println("num:"+MainClass05.num);
	}
}
//출력을 위해 참조한 this.num은 사용할 수 없음
//메인메소드는 static영역에 만들어짐. 
//this는 힙 영역에서 자기자신을 참조할 때 사용할 수 있음.
//num을 static영역으로 만들어주고 MainClass05.num 또는 num으로 참조
//아무튼 static메소드 안에서는 static자원만 활용이 가능함