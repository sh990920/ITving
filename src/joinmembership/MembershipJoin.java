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
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class MembershipJoin {
	public MembershipJoin() {
		Frame f = new Frame("ȸ������");

		f.setBounds(450, 150, 330, 300);
		f.setBackground(new Color(56, 56, 56));
		f.setLayout(null);

		f.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);// â�� ��� ������
		// ��Ʈ
		Font font = new Font("", Font.PLAIN, 10); // name, id, pw, email font
		Font text = new Font("", Font.BOLD, 10);
		// font.PLAIN�� ��Ʈ �⺻���¸� ����

		// Label: Name, Id, Pw, Email
		Label q1 = new Label("Name: ");
		q1.setBounds(10, 40, 60, 20);
		q1.setForeground(Color.orange);
		q1.setFont(text);
		f.add(q1);
		Label q2 = new Label("Id: ");
		q2.setBounds(10, 100, 60, 20);
		q2.setForeground(Color.orange);
		q2.setFont(text);
		f.add(q2);
		Label q3 = new Label("Pw: ");
		q3.setBounds(10, 160, 60, 20);
		q3.setForeground(Color.orange);
		q3.setFont(text);
		f.add(q3);
		Label q4 = new Label("Email: ");
		q4.setBounds(10, 220, 60, 20);
		q4.setForeground(Color.orange);
		q4.setFont(text);
		f.add(q4);

		// Ű���忡�� ���� �Է¹ޱ� ���� �Է»���
		TextField name = new TextField("name",10); // name
		TextField id = new TextField(10); // id
		TextField pw = new TextField(15); // pw
		TextField email = new TextField(30); // email
		pw.setEchoChar('*'); // ��й�ȣ�� �Է��� *������� ǥ�õǵ��� ����

		// �Է�â ��ġ ���� �� ��Ʈ ����
		name.setBounds(70, 40, 170, 20);
		id.setBounds(70, 100, 170, 20);
		pw.setBounds(70, 160, 170, 20);
		email.setBounds(70, 220, 170, 20);
		name.setFont(font);
		id.setFont(font);
		pw.setFont(font);
		email.setFont(font);
		f.add(name);
		f.add(id);
		f.add(pw);
		f.add(email);

		Button btn_overlapping = new Button("�ߺ�Ȯ��");
		Button btn_join = new Button("ȸ������");
		Button btn_cancel = new Button("���");
		btn_overlapping.setBounds(250, 100, 50, 20); // �ߺ�Ȯ��
		btn_join.setBounds(70, 250, 80, 40); // ����
		btn_cancel.setBounds(180, 250, 80, 40); // ����
		f.add(btn_overlapping);
		f.add(btn_join);
		f.add(btn_cancel);

		// name, id, pw, email�� �ϳ��� ������� ������ ���� �Ұ���ó��
		if (name.getText().trim().equals("") || id.getText().trim().equals("") || pw.getText().trim().equals("")
				|| email.getText().trim().equals("")) {

			btn_join.setEnabled(false);
		} // if

		// id �ߺ�Ȯ�� ������ �޾ƾ� ȸ������ ��ư�� Ȱ��ȭ
		btn_overlapping.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = "C:/ITving/UserInfo/" + id.getText();
				File f = new File(path);
				if (id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "id�� �Է����ּ���");
					btn_join.setEnabled(false);
				} // if
				else if (f.exists()) {
					JOptionPane.showMessageDialog(null, "�ش� id�� �����ϴ� id�Դϴ�.");
					btn_join.setEnabled(false);
				} // else if
				if (!f.exists() && !(name.getText().isEmpty()) && !(id.getText().isEmpty())) {
					JOptionPane.showMessageDialog(null, "��밡���� id�Դϴ�.");
					btn_join.setEnabled(true);
				} // if

			}
		});

		// ȸ������ �̺�Ʈ ó��
		btn_join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �̸��� ���� ���� ex) (���� or ���� or (-,_,.) @ (���� or ���� or (-,_,.) . (���� or ����)
				String pattern = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";

				if (!(name.getText().isEmpty()) && !(id.getText().isEmpty()) && !(pw.getText().isEmpty())
						&& !(email.getText().isEmpty()) && Pattern.matches(pattern, email.getText())) {
					LoginInfo info = new LoginInfo();
					info.LoginInfo(name.getText(), id.getText(), pw.getText(), email.getText());
					new LoginWriter(info);
					JOptionPane.showMessageDialog(null, "ȸ�������� ���������� �Ǿ����ϴ�.");
					f.dispose();
				}

				// email ����� ����� ������ ������ ȸ������ �Ұ��� ó��
				else {
					JOptionPane.showMessageDialog(null, "�ùٸ� �̸��� ����� �ƴմϴ�. �ٽ� �Է����ּ���");
				}

			}
		});

		// ��� �̺�Ʈ ó��
		btn_cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		// â ���� �̺�Ʈ ó��
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		f.setVisible(true);
	}
}
