package test.main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Quiz02 extends JFrame implements ActionListener{
	int count = 0;
	JTextField tf1;
	JButton bt1,bt2;
	
	Quiz02(){
		
		//JTextField
		tf1=new JTextField();
		tf1.setBounds(40,30,400,300);
		bt1 = new JButton("append");
		bt1.setBounds(220, 400, 100, 40);
		bt2 = new JButton("불러오기");
		bt2.setBounds(330, 400, 100, 40);
		
		// ActionListener
		bt1.addActionListener(this);
		bt2.addActionListener(this);
				
		//JFrame
		add(tf1);
		add(bt1);add(bt2);
				
		setTitle("QUIZ 02");
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		}
	
	
	
	public static void main(String[] args) {
		new Quiz02();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		File memoFile=new File("c:/acorn202206/myFolder/quiz02.txt");
		String text=tf1.getText();
		System.out.println("문자가 입력되었습니다 :"+text);
		try {
			if(!memoFile.exists()) {
			memoFile.createNewFile();
			}
			FileWriter fw=new FileWriter(memoFile,true);
			fw.write(text);
			fw.flush();
			fw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}
