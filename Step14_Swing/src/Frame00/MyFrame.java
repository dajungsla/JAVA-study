package Frame00;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
	//부모 생성자에 프레임의 제목 넘겨주기
		super(title);
		
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("전송");
		
		//프레임에 버튼 추가하기(FlowLayout의 영향을 받음)
		add(sendBtn);
		
		//버튼의 동작을 리스닝 할 객체(interface type)
		ActionListener listener=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("오에엥 전송!!!");
				/*
				 * JOptionPane클래스의 static메소드를 호출하여 메세지 다이얼로그 띄우기
				 * 
				 * .showMessageDialog(프레임의 참조값, 출력할 메세지)
				 * */
				JOptionPane.showMessageDialog(MyFrame.this,"전숑");
			}
		};
			
		sendBtn.addActionListener(listener);
		
		
		//삭제버튼 만들고 프레임에 추가하기
		JButton deleteBtn=new JButton("삭제");
		add(deleteBtn);
		
		/* 삭제버튼 기능 추가
		 * 지역변수를 만들지 않고, 추상메소드가 하나니까 함수 형태로 만들기.
		 * deleteBtn.addActionListener(e)->{MyFrame.this,"삭제 합니다"};
		 * */
		deleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(MyFrame.this, "삭제를 합니다.");
			}
		});
	}

	
	public static void main(String[]args) {
		JFrame f=new MyFrame("나의 프레임");
		//객체를 생성해서 참조값 가져오기
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}


}	