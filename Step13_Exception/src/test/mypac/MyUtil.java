package test.mypac;

public class MyUtil {
	
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("그림 완성");
	}
	
	//메소드 안에서 발생하는 exception을 던져버리는 경우
	//메소드를 호출하는 쪽에서 해당 예외를 처리해야 한다.
	
	public static void send() throws InterruptedException {
		System.out.println("5초 동안 전송해요.");
		
		Thread.sleep(5000);
		
		System.out.println("전송 완료!");
	}

}
