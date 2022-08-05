package test.main;

import java.io.File;

public class MainClass08 {
	public static void main(String[] args) {
		File f=new File("c:/");
		//파일 객체 목룍 (File[])을 얻어내기
		File[] files=f.listFiles();
		//반복문 돌면서 File객체를 하나씩 참조하기
		for(File tmp:files) {
			//만일 해당 파일이 디렉토리라면
			if(tmp.isDirectory()) {
				System.out.println("[ "+tmp.getName()+" ]");
			}else {
				System.out.println(tmp.getName());
			}
		}
	}
}
