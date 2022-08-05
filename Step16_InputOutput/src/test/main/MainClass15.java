package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass15 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역변수 미리 만들기
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//1.jpg에서 byte를 읽어낼 객체
			fis=new FileInputStream("C:/acorn202206/myFolder/1.jpg");
			// copied.jpg에 byte를 출력할 객체
			fos=new FileOutputStream("C:/acorn202206/myFolder/copiedd.jpg");
			while(true) {
				//1byte 읽어내기
				int data=fis.read();
				System.out.println(data);
				if(data==-1)break; //읽을 데이터 없을 경우 반복문 탈출
				
				//읽어낸 1byte 출력하기
				fos.write(data);
				fos.flush();
		}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
