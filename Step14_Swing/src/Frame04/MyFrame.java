package Frame04;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	//생성자
	public MyFrame(String title) {
		//부모 생성자에 프레임의 제목 넘겨주기
		super(title);
		//setBounds(x,y,width,height)
		setBounds(100,100,500,500);
		//창을 닫았을 때 프로세스도 같이 종료되도록 한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임 레이아웃 매니저를 사용하지 않기때문에 UI를 좌표에 직접 배치해야 한다.
		setLayout(null);
		
	
		//BorderLayout사용하기
		setLayout(new BorderLayout());
		
		JButton btn1=new JButton("버튼1");
		add(btn1,BorderLayout.NORTH);
		
		JButton btn2=new JButton("버튼2");
		add(btn2,BorderLayout.WEST);
		
		JButton btn3=new JButton("버튼3");
		add(btn3,BorderLayout.EAST);
		
		JButton btn4=new JButton("버튼4");
		add(btn4,BorderLayout.SOUTH);
		
		
		//프레임이 화면상에 보이도록 한다.
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new MyFrame("나의 프레임");
	}
}
