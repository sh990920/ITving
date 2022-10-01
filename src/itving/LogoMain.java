package itving;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import kategorie.Kategoriemain;

public class LogoMain {
	public LogoMain() {

		Frame f = new Frame("ITVING");
		f.setBounds(500, 600, 500, 550);
		f.setLayout(null);
		f.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);// â�� ��� ������

		// ��Ʈ ���� �� �ؽ�Ʈ ����
		Font text = new Font("", Font.BOLD, 20);
		Label q1 = new Label("ITVING �̿��� ó���̽Ű���?");
		Label q2 = new Label("ITVING���� ��ȭ ��õ ����� �̿��غ�����");
		q1.setBounds(100, 75, 280, 50);
		q2.setBounds(45, 135, 410, 50);
		q1.setFont(text);
		q2.setFont(text);
		q1.setForeground(Color.ORANGE);
		q1.setBackground(new Color(56, 56, 56));
		q2.setForeground(Color.ORANGE);
		q2.setBackground(new Color(56, 56, 56));
		f.add(q1);
		f.add(q2);

		// ���̵�, �˻� ��ư Ȱ��ȭ
		JButton guide = new JButton(new ImageIcon("�̹���/�帣������.png"));
		JButton search = new JButton(new ImageIcon("�̹���/��ȭ�˻�.png"));
		f.add(guide);
		f.add(search);
		guide.setBounds(30, 300, 205, 205);
		search.setBounds(265, 300, 205, 205);

		// ����� �̹��� �ҷ�����
		ImageIcon img = new ImageIcon("�̹���/color.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 500, 800);
		f.add(jl);
		f.setVisible(true);

		// ���̵� â �����ִ� �̺�Ʈ ó��
		guide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Kategoriemain();
				f.dispose();
			}
		});

		// ���õ� ��ȭ �����ִ� â �̺�Ʈ ó��
		search.addActionListener(new ActionListener() {
			// SelectedMovies���� Search�� ����
			@Override
			public void actionPerformed(ActionEvent e) {
				new Search();
				f.dispose();
			}

		});
		// x��ư ������ ȭ�� ������ �̺�Ʈ ó��
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// x��ư�� �����ϸ� ���Ῡ�θ� ���� �˾��������� �������
				// �߿�!!! �͸�Ŭ������ �̿���
				f.dispose();
			}
		});
	}
}
