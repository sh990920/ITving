package movie;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import itving.SelectedMovies;
import movieInformation.GetMovies;

public class Action_SecretReunion {

	public Action_SecretReunion() {

		Frame f = new Frame("ITving");

		f.setBounds(500, 600, 630, 900);
		f.setLayout(null);

		Color c = new Color(56, 56, 56);
		f.setBackground(c);

		Font font = new Font("", Font.CENTER_BASELINE, 20);

		JButton btn_Play = new JButton("���");

		btn_Play.setBounds(10, 640, 630, 50);

		GetMovies i = new GetMovies();

		Label q1 = new Label("2010");

		JButton btn_out = new JButton(new ImageIcon("�̹���/�ڷΰ���.png"));
		btn_out.setBounds(5, 30, 50, 50);

		JButton btn_age = new JButton(new ImageIcon("�̹���/15��.png"));
		btn_age.setBounds(70, 510, 30, 30);

		q1.setBounds(10, 500, 100, 50);
		q1.setFont(font);

		q1.setBackground(c);
		q1.setForeground(Color.WHITE);

		Label q2 = new Label(i.getAction_SecretReunion_Actor());
		q2.setBounds(10, 550, 400, 50);
		q2.setFont(font);

		q2.setBackground(c);
		q2.setForeground(Color.WHITE);

		Label q3 = new Label(i.getAction_SecretReunion_Name());
		q3.setBounds(10, 450, 300, 50);
		q3.setFont(font);

		q3.setBackground(c);
		q3.setForeground(Color.WHITE);

		TextArea ta = new TextArea(null, 10, 10, TextArea.SCROLLBARS_VERTICAL_ONLY);

		ta.setBackground(c);
		ta.setForeground(Color.WHITE);
		ta.setFont(font);
		ta.setBounds(10, 690, 610, 200);
		ta.setEditable(false);

		ta.append(i.getAction_SecretReunion_Outline());

		f.add(btn_out);
		f.add(btn_age);

		f.add(q1);
		f.add(q2);
		f.add(q3);
		f.add(btn_Play);
		f.add(ta);

		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setVisible(true);

		btn_out.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		
		String path = "�׼�_������";
		// ������ �����ϱ����ؼ� �����ϴ� ��ü
		GifPlayer ge = new GifPlayer();
		// ��� ��ư
		btn_Play.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ge.dispose();
				try {
					ge.mp3.stop();
				} catch (Exception e2) {
					// TODO: handle exception
				} finally {
					ge.newMovie(path);
					ge.playMovie();
				}

			}
		});

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				f.dispose();

			};

		});

	}
}
