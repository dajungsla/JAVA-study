package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("전원을 켜요");
			}

			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("전원을 꺼요");
			}
		};
		
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("나는 바보");
			}
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("너는 바보");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}

}
