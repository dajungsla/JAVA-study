package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame07 extends JFrame implements ActionListener{
	//필드
	JTextField tf;
	
	
	//생성자
	public Frame07(String title) {
		super(title);
		
		//레이아웃
		setLayout(new FlowLayout());
		
		this.tf=new JTextField(10);
		JButton printBtn=new JButton("출력하기");
		
		add(tf);
		add(printBtn);
		
		//버튼에 리스터 등록
		printBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		new Thread(()->{
			//입력한 문자열을 읽어온다.
			String inputNum=tf.getText();
			//입력한 숫자형태의 문자열을 실제 정수로 바꾸기
			int num=Integer.parseInt(inputNum);
			for(int i=0;i<9;i++) {
				// TODO: handle exception
				try {//1초씩 지연시키기
					Thread.sleep(1000);
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				int result=num*(i+1);
				System.out.println(num+"X"+(i+1)+"="+result);
			}
		}).start();
		//바로 리턴한다.
		System.out.println("actionPerformed()메소드가 리턴됩니다.");

	}
	
	public static void main(String[] args) {
		JFrame frame=new Frame07("구구단 예제");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,500,500);
		frame.setVisible(true);
	}

}
