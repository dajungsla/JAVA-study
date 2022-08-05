package test.main;

import java.io.File;

public class MainClass07 {
	public static void main(String[] args) {
		//c:/를 access할 수 있는 파일 객체 생성
		File f=new File("c:/");
		String[] filenames=f.list();
		
		//배열에 들어있는 문자열 출력하기
		for(int i=0;i<filenames.length;i++) {
			System.out.println(filenames[i]);
		//확장 for문
		/* for(String tmp:fileNames){
		 * 		System.out.println(tmp);
		 * }
		 * */
		}
	}
}
