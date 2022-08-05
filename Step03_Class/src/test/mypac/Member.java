package test.mypac;
/*
 * Member 객체에 회원의 번호, 이름, 주소를 담고 싶다면
 * 클래스를 어떻게 설계 해야할까?
 * 
 * 저장소(필드)가 3개 필요하다.
 * 필드의 type은 int, string이 적당할 것 같음
 * 필드의 값은 나중에 new Member()한 이후에 담을 예정
 * */

public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	
	//메소드
	public void showInfo(){
		//본인의 클래스를 참조하고 싶을때 this. 사용
		//this는 객체 자신의 참조값을 가리키는 예약어
		System.out.println("번호"+this.num+" 이름:"+this.name+" 주소:"+this.addr);
	}
	

}

//static이 아닌 객체는 new를 해야 실체가 만들어짐