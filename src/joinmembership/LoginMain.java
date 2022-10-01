package joinmembership;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class LoginMain {
public static void main(String[] args) {
	
	Frame f = new Frame("ITving");
	f.setBounds(450,150,450,450);
	f.setLayout(null);
	Button btn_membershipJoin = new Button("회원가입");
	Button btn_login = new Button("로그인");
	f.setResizable(false);//창의 크기를 변경하지 못하게
	f.setLocationRelativeTo(null);//창이 가운데 나오게
	f.add(btn_membershipJoin);
	f.add(btn_login);
	btn_membershipJoin.setBounds(70,350,120,50);
	btn_login.setBounds(260,350,120,50);
	
	// x버튼 누르면 화면 꺼지게 이벤트 처리 
	f.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			//x버튼을 감지하면 종료여부를 묻는 팝업프레임을 띄워주자 
			//중요!!! 익명클래스를 이용함 
			System.exit(0);
		}
	
});
	
	ActionListener al = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//클릭된 버튼에 부착된 텍스트를 가져온다
			String select = e.getActionCommand();
			switch(select) {
			case "회원가입" :
				new MembershipJoin();
				break;
			case "로그인" :
				new LoginWindow();
				f.dispose();
				break;
			
			}
		}
	};
	btn_membershipJoin.addActionListener(al);
	btn_login.addActionListener(al);
	

	//사용할 이미지 불러오기
	ImageIcon img = new ImageIcon("이미지/ITVINGLOGO.png");
	JLabel jl = new JLabel(img);
	jl.setBounds(0,0,450,450);
	f.add(jl);
	
	f.setVisible(true);
	

}//main
}
