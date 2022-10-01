package joinmembership;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JOptionPane;

import itving.LogoMain;
import itving.LogoOffset;

public class LoginWindow {
	public LoginWindow() {

		Frame f = new Frame("�α���");

		f.setBounds(450, 150, 330, 200);
		f.setBackground(new Color(56, 56, 56));
		f.setLayout(null);
		f.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);// â�� ��� ������
		// ��Ʈ
		Font font = new Font("", Font.PLAIN, 15); // id,pw font
		Font text = new Font("", Font.BOLD, 20);
		// text font

		// Label: Id, Pw
		Label q1 = new Label("Id: ");
		q1.setForeground(Color.orange);
		q1.setBounds(20, 40, 60, 20);
		q1.setFont(text);
		f.add(q1);
		Label q2 = new Label("Pw: ");
		q2.setForeground(Color.orange);
		q2.setBounds(20, 100, 60, 20);
		q2.setFont(text);
		f.add(q2);

		// Ű���忡�� ���� �Է¹ޱ� ���� �Է»���
		TextField id = new TextField(10); // id
		TextField pw = new TextField(10); // pw
		pw.setEchoChar('*'); // ��й�ȣ�� �Է��� *������� ǥ�õǵ��� ����

		// �Է�â ��ġ ���� �� ��Ʈ ����
		id.setBounds(80, 40, 150, 25);
		pw.setBounds(80, 100, 150, 25);

		id.setFont(font);
		pw.setFont(font);
		f.add(id);
		f.add(pw);

		// Ȯ��, ���, id ã��, pw ã�� ��ư
		Button btn_login = new Button("�α���");
		Button btn_cancel = new Button("���");
		Button btn_findId = new Button("Id ã��");
		Button btn_findPw = new Button("Pw ã��");
		Button btn_membershipjoin = new Button("ȸ������");
		btn_login.setBounds(70, 150, 80, 30); // �ߺ�Ȯ��
		btn_cancel.setBounds(170, 150, 80, 30); // ����
		btn_findId.setBounds(255, 42, 60, 20); // ����
		btn_findPw.setBounds(255, 102, 60, 20); // ����
		f.add(btn_login);
		f.add(btn_cancel);
		f.add(btn_findId);
		f.add(btn_findPw);

		// �α��� ��ư �̺�Ʈ ó�� Ȱ��ȭ
		btn_login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginInfo info = new LoginInfo();

				String q_id = id.getText(); /// question id
				String q_pw = ""; // question pw
				info.setId(q_id);
				LoginLoader loader = new LoginLoader(info);
				q_pw = loader.getInfo().getPw();
				info.setPw(q_pw);
				if (id.getText().equals(q_id) && pw.getText().equals(q_pw)) {
					JOptionPane.showMessageDialog(null, q_id + " �� ȯ���մϴ�.");
					new LogoOffset();
//					new LogoMain();
					f.dispose();
				} // if

				else if (id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "id�� �Է����ּ���");
				} else {

					JOptionPane.showMessageDialog(null, "id Ȥ�� pw�� Ȯ�����ּ���");
				}
			}
		});
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ���� ��ư�� ������ �ؽ�Ʈ�� �����´�
				String select = e.getActionCommand();
				switch (select) {
				case "Id ã��":
					new FindId();
					break;
				case "Pw ã��":
					new FindPw();
					break;
				case "���":
					f.dispose();
					break;
				}
			}
		};
		btn_findId.addActionListener(al);
		btn_findPw.addActionListener(al);
		btn_cancel.addActionListener(al);

		// â���� ��� ����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// x��ư�� �����ϸ� ���Ῡ�θ� ���� �˾��������� �������
				// �߿�!!! �͸�Ŭ������ �̿���
				f.dispose();
			}
		});

		f.setVisible(true);
	}// Generators
}
