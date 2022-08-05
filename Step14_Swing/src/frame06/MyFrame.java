package frame06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
/* MyFrame을 ActionListener type으로 만들어 주기 : implements
 * implements 후에 override해주기 : interface로 강제 구현 */
public class MyFrame extends JFrame implements ActionListener{
	//생성자
	public MyFrame(String title) {
	//부모 생성자에 프레임의 제목 넘겨주기
		super(title);
		
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("전송");
		//프레임에 버튼 추가하기(FlowLayout의 영향을 받음)
		add(sendBtn);
		
		/*MyFrame을 ActionListener type으로 만들어 주기*/
		sendBtn.addActionListener(this);
		
		//삭제버튼 만들고 프레임에 추가하기
		JButton deleteBtn=new JButton("삭제");
		add(deleteBtn);
		deleteBtn.addActionListener(this);
		

	}

	public static void main(String[]args) {
		JFrame f=new MyFrame("나의 프레임");
		//객체를 생성해서 참조값 가져오기
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("냐냐옹 어려와용");
		JOptionPane.showMessageDialog(this, "우에엑!!!");
	}


}	