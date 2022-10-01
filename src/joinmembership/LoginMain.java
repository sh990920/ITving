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
	Button btn_membershipJoin = new Button("ȸ������");
	Button btn_login = new Button("�α���");
	f.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
	f.setLocationRelativeTo(null);//â�� ��� ������
	f.add(btn_membershipJoin);
	f.add(btn_login);
	btn_membershipJoin.setBounds(70,350,120,50);
	btn_login.setBounds(260,350,120,50);
	
	// x��ư ������ ȭ�� ������ �̺�Ʈ ó�� 
	f.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			//x��ư�� �����ϸ� ���Ῡ�θ� ���� �˾��������� ������� 
			//�߿�!!! �͸�Ŭ������ �̿��� 
			System.exit(0);
		}
	
});
	
	ActionListener al = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//Ŭ���� ��ư�� ������ �ؽ�Ʈ�� �����´�
			String select = e.getActionCommand();
			switch(select) {
			case "ȸ������" :
				new MembershipJoin();
				break;
			case "�α���" :
				new LoginWindow();
				f.dispose();
				break;
			
			}
		}
	};
	btn_membershipJoin.addActionListener(al);
	btn_login.addActionListener(al);
	

	//����� �̹��� �ҷ�����
	ImageIcon img = new ImageIcon("�̹���/ITVINGLOGO.png");
	JLabel jl = new JLabel(img);
	jl.setBounds(0,0,450,450);
	f.add(jl);
	
	f.setVisible(true);
	

}//main
}
