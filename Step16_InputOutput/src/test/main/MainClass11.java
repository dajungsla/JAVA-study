package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass11 {
	public static void main(String[] args) {
		//문자열을 저장할 파일을 만들기 위한 File 객체
		File memoFile=new File("c:/acorn202206/myFolder/memo.txt");
		try {
			/*
			 * if(memoFile.exists()==false){}
			 * if(!memoFile.exists()){}
			 * */
			if(!memoFile.exists()) {
				memoFile.createNewFile();
			}
			//파일에 문자열을 출력할 수 있는 FileWriter객체
			FileWriter fw=new FileWriter(memoFile, true);
			fw.write("안녕하세요, 하오에요!");
			fw.write("\r\n");
			fw.write("메모장에 글을 써볼게요..");
			fw.write("\r\n");
			fw.write("냐옹");
			fw.write("\r\n");
			fw.flush();
			fw.close();//출력을 다 했으면 마무리 한다.
			System.out.println("파일에 문자열을 저장했습니다.");
			
			}catch(IOException e){
			e.printStackTrace();
			}
	}
}

