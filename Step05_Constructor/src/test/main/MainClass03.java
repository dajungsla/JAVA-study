package test.main;

import test.mypac.CPU;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		//1. MacBook 객체를 생성해서 참조값을 mac1이라는 지역변수에 담기
		MacBook mac1=new MacBook(new CPU(), new Memory(), new HardDisk());
		
		//2. mac1 지역변수에 들어있는 참조값을 이용해서 doGame()메소드를 호출하여 게임 하기
		mac1.doGame();
		
		CPU c1=new CPU();
		Memory m1=new Memory();
		HardDisk h1=new HardDisk();
		//생성자의 인자로 전달할 객체가 미리 어딘가에 준비되어 있다면, 해당객체를 참조하여 전달할 수도 있다.
		MacBook mac2=new MacBook(c1,m1,h1);
		mac2.doGame();
		
		
	}

}
