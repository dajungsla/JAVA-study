package Frame05;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
	//부모 생성자에 프레임의 제목 넘겨주기
		super(title);
		//setBounds(x,y,width,height)
		setBounds(100,100,500,500);
		//창을 닫았을 때, 프로세스도 같이 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임이 화면상에 보이도록 한다.
		setVisible(true);
	}
	
	public static void main(String[]args) {
		JFrame f=new MyFrame("나의 프레임");
		//객체를 생성해서 참조값 가져오기
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}


}	