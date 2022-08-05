package test.auto;

public class CampingCar extends Car{

	public CampingCar(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	
	public void travel() {
		System.out.println("여행을 가요!");
	}
	public void washAndCook() {
		System.out.println("씻을 수 있고, 요리할 수 있어요.");
	}
}
