package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		/*
		 * FileReader객체를 통해서 메모장에 있는 텍스트를 콘솔창에 출력하자
		 * */
		File memoFile=new File("c:/acorn202206/myFolder/memo.txt");
		//필요한 객체를 담을 지역변수를 미리 만들어 둔다.
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(memoFile);
			br=new BufferedReader(fr);
			
			while(true) {//반복문 돌면서 문자 코드 하나씩 읽어내기
				String line=br.readLine();
				if(line==null) {//읽을 데이터 없을 경우 반복문 탈출
					break;
				}
				System.out.println(line); //readLine은 개행기호 없는 채로 읽어냄
			}

		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//예외가 발생하던 안하던 실행이 반드시 보장되는 블럭
			//finally절에서도 예외발생 > try catch 실행
			try {
				if(br!=null)br.close();
				if(fr!=null)fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
