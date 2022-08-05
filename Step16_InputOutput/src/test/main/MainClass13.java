package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		/*
		 * FileReader객체를 통해서 메모장에 있는 텍스트를 콘솔창에 출력하자
		 * */
		File memoFile=new File("c:/acorn202206/myFolder/memo.txt");
		
		try {
			FileReader fr = new FileReader(memoFile);
			BufferedReader br=new BufferedReader(fr);
			
			while(true) {//반복문 돌면서 문자 코드 하나씩 읽어내기
				String line=br.readLine();
				if(line==null) {//읽을 데이터 없을 경우 반복문 탈출
					break;
				}
				System.out.println(line); //readLine은 개행기호 없는 채로 읽어냄
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
