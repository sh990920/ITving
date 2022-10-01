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

public class FindId {
	public FindId() {
		Frame f = new Frame("id ã��");

		f.setBounds(450, 150, 330, 200);
		f.setBackground(new Color(56, 56, 56));
		f.setLayout(null);
		f.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);// â�� ��� ������
		
		// ��Ʈ
		Font font = new Font("", Font.PLAIN, 15); // name, email font
		Font text = new Font("", Font.BOLD, 20);
		// text font

		// Label: name, email
		Label q1 = new Label("Name: ");
		q1.setForeground(Color.orange);
		q1.setBounds(20, 40, 60, 20);
		q1.setFont(text);
		f.add(q1);
		Label q2 = new Label("Email: ");
		q2.setForeground(Color.orange);
		q2.setBounds(20, 100, 60, 20);
		q2.setFont(text);
		f.add(q2);

		// Ű���忡�� ���� �Է¹ޱ� ���� �Է»���
		TextField name = new TextField(10); // name
		TextField email = new TextField(35); // email

		// �Է�â ��ġ ���� �� ��Ʈ ����
		name.setBounds(90, 40, 150, 25);
		email.setBounds(90, 100, 150, 25);

		name.setFont(font);
		email.setFont(font);
		f.add(name);
		f.add(email);

		// id ã�� ��� ��ư
		Button btn_find = new Button("ã��");
		Button btn_cancel = new Button("���");
		btn_find.setBounds(70, 150, 70, 20); // id ã��
		btn_cancel.setBounds(170, 150, 70, 20); // ���
		f.add(btn_find);
		f.add(btn_cancel);

		// id ã�� �̺�Ʈ Ȱ��ȭ
		btn_find.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String q_name = name.getText(); // question name
				String q_email = email.getText(); // question email
				String s_name = ""; // save name
				String s_email = ""; // save email
				String path = "C:/ITving/UserInfo/";
				File f1 = new File(path);
				LoginInfo info = new LoginInfo();
				if (f1.isDirectory()) {
					File[] idlist = f1.listFiles();
					for (int i = 0; i < idlist.length; i++) {
						info.setId(idlist[i].getName());
						LoginLoader loader = new LoginLoader(info);
						s_name = loader.getInfo().getName();
						s_email = loader.getInfo().getEmail();
						if (q_name.equals(s_name) && q_email.equals(s_email)) {
							JOptionPane.showMessageDialog(null, "ȸ������ id�� " + idlist[i].getName() + "�Դϴ�");
							f.dispose();
							break;
						} // inner if
					} // for
					if (!(q_name.equals(s_name)) || !(q_email.equals(s_email))) {
						JOptionPane.showMessageDialog(null, "�����ϴ� id�� �����ϴ�.");
					}
				} // outer if
			}
		});

		// ��ҹ�ư �̺�Ʈ ó��
		btn_cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

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
	}
}
