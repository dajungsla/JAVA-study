package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		/*
		 * FileReader객체를 통해서 메모장에 있는 텍스트를 콘솔창에 출력하자
		 * */
		File memoFile=new File("c:/acorn202206/myFolder/memo.txt");
		FileReader fr;
		try {
			fr = new FileReader(memoFile);
			while(true) {//반복문 돌면서 문자 코드 하나씩 읽어내기
				int ch=fr.read();
				char reading=(char)ch;
				System.out.print(reading);//자동 개행 print()
				if(ch==-1)break; //리턴값-1에서 반복문 탈출
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


