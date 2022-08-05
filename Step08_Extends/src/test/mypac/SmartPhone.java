package test.mypac;

public class SmartPhone extends HandPhone{
	public SmartPhone() {
		super(); 
		//부모생성자 호출하는 표현식, 부모생성자의 default생성자를 호출할 때 생략 가능.
		System.out.println("SmartPhone 생성자 호출");
	}
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}

	//override 부모 클래스의 메소드 재정의
	//사진찍는 메소드 재정의
	@Override
	public void takePicture() {
		System.out.println("1000만 화소의 사진을 찍어요");
	}
	
}