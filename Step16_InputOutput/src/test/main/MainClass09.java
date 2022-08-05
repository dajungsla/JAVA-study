package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		//이미 존재하거나 혹은 만들 예정인 파일을 제어할 수 있는 File 객체 생성
		File f1=new File("c:/acorn202206/myFolder/gura.txt");
		if(f1.exists()) {
			f1.delete();
			System.out.println("gura.txt파일을 삭제했습니다.");
		}else {
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("gura.txt파일을 만들었습니다.");
		}
	}
}
