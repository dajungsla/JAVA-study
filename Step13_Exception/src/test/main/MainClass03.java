package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main메소드가 시작되었습니다.");
		
		//Thread클래스의 static메소드를 사용 > try catch
		try {
			Thread.sleep(5000);
			
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main메소드가 끝났습니다.");
	}

}
