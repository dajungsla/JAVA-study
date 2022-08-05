package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass10 {
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++) {
			//String folderNum=Integer.toString(i);
			File f1=new File("c:/acorn202206/myFolder/folder"+i);
			
			if(f1.exists()) {
				f1.delete();
                System.out.println("폴더"+i+"를 삭제했습니다.");
			}else {
				f1.mkdir();
				}
				System.out.println("폴더"+i+"를 생성했습니다.");

			}
		}
}
		//폴더 만들기
		/*
		 * 위의 코드를 참고하여 폴더 1000개를 만들어보세요.
		 * 폴더명은 forder1
		 * */
		
