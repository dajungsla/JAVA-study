package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass16 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역변수 미리 만들기
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//1.jpg에서 byte를 읽어낼 객체
			fis=new FileInputStream("C:/acorn202206/myFolder/1.jpg");
			// copied.jpg에 byte를 출력할 객체
			fos=new FileOutputStream("C:/acorn202206/myFolder/copiedd.jpg");
			byte []buffer=new byte[1024];
			while(true) {
				//byte[]객체를 read()메소드에 전달해서 byte를 읽어내고
				//몇 byte를 읽었는지 리턴받기
				int readedByte=fis.read(buffer);
				System.out.println(readedByte);
				//만일 더 이상 읽ㅇ르 byte가 없다면
				if(readedByte==-1)break;
				//읽은 만큼 fos객체를 이용하여 출력하기(0번 방부터 읽은 만큼)
				fos.write(buffer, 0, readedByte);
				
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
