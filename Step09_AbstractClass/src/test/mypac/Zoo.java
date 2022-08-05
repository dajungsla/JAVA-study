package test.mypac;

public class Zoo {
	int Num=999;
	/*
	 *  클래스 내에 정의할 수 있는 것 : 생성자, 필드, 메소드, "클래스"
	 * */
	
	//내부 클래스( inner class)
	public class Monkey{
		public void say() {
			System.out.println("안녕 나는 숭숭이야");
		}
	}
	public class Tiger{
		public void say() {
			System.out.println("안녕 나는 호랑이");
		}
	}
	//메소드
	   public Monkey getMonkey() {
		  //내부 클래스로 객체를 생성해서 리턴해주는 메소드 
	      return new Monkey();
	   }
	   public Tiger getTiger() {
	      return new Tiger();
	   }      

}

