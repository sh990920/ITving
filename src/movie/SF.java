package movie;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import kategorie.PupupFrame;

public class SF {
	public SF() {
		Frame f = new Frame("SF");
		f.setLayout(null);
		f.setBounds(500, 600, 630, 1000);
		f.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);// â�� ��� ������
		// ��ȭ ������
		JButton a1 = new JButton(new ImageIcon("�̹���/sf_��������.png"));
		JButton a2 = new JButton(new ImageIcon("�̹���/sf_�¸�ȣ.png"));
		JButton a3 = new JButton(new ImageIcon("�̹���/sf_�ζ�.png"));
		JButton a4 = new JButton(new ImageIcon("�̹���/sf_�ʴɷ���.png"));

		// ������ ũ��
		a1.setBounds(50, 270, 250, 330);
		a2.setBounds(330, 270, 250, 330);
		a3.setBounds(50, 630, 250, 330);
		a4.setBounds(330, 630, 250, 330);

		// �߰�
		f.add(a1);
		f.add(a2);
		f.add(a3);
		f.add(a4);

		// �ڷΰ���
		JButton btn_logout = new JButton(new ImageIcon("�̹���/�ڷΰ���.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);

		// �ܰ��� �����
		a1.setBorderPainted(false);
		a2.setBorderPainted(false);
		a3.setBorderPainted(false);
		a4.setBorderPainted(false);

		// ���
		ImageIcon img = new ImageIcon("�̹���/SF��ȭ���.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);

		f.setVisible(true);
		
		a1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_SnowPiercer();
				
			}
		});
		a2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_SpaceSweepers();
				
			}
		});
		a3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_ILLANG();
				
			}
		});
		a4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_Haunters();
				
			}
		});
		
		btn_logout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
		});
		
		// ����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// ���� ����? �˾�â
				new PupupFrame();
			}
		});
	}

}
