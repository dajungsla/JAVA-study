package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		File f=new File("C:/acorn202206/myFolder/memo.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}

}
