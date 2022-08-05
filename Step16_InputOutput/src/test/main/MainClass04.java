package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//학습을 위해서 PringStream 객체를 부모type의 OutputStream으로 받아보기
		//OutputStream도 1byte처리 스트림이다.
		OutputStream os=ps;
		try {
			os.write(97);
			os.write(98);
			os.write(99);
			os.write(100);
			os.write(44032);
			
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
