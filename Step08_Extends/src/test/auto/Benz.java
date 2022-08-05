package test.auto;

public class Benz extends Car {
	//Engine type을 전달받는 생성자
	public Benz(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	//메소드
	public void smoothDrive() {
		System.out.println("부드럽고 조용하게 달려요!");
	}

}
