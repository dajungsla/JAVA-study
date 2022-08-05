package test.main;

import test.mypac.Calculator;

public class MainClass05 {
	public static void main(String[] args) {
		Calculator plus=(a,b)->{
			return a+b;
		};
		Calculator minus=(a,b)->{
			return a-b;
		};
		Calculator multi=(a,b)->a*b;
		Calculator divide=(a,b)->a/b; 
		/* FunctionalInterface형태, 
		 * 익명의 이너클래스로 생성된 객체, 
		 * 하나짜리 메소드 오버라이드*/
		
		
		double result=plus.exec(10,20);
		double result2=minus.exec(30,10);
		double result3=multi.exec(10, 10);
		double result4=multi.exec(40, 10);
	}

}
