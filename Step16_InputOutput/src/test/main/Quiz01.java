package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열 입력:");
		String str=sc.nextLine();
		//quiz.txt에 access할 수 있는 파일 객체 생성(없으면 만들 수 있고, 있으면 수정 및 삭제 가능)
		File memoFile=new File("c:/acorn202206/myFolder/quiz.txt");
		try {
			if(!memoFile.exists()) {
			memoFile.createNewFile();
			}
			FileWriter fw=new FileWriter(memoFile,true);
			fw.write("\r\n");
			fw.write(str);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
