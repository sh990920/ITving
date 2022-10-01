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

public class Ani_Totoro {

	public Ani_Totoro() {

		Frame f = new Frame("ITving");

		f.setBounds(500, 600, 630, 900);
		f.setLayout(null);

		Color c = new Color(56, 56, 56);
		f.setBackground(c);

		Font font = new Font("", Font.CENTER_BASELINE, 20);

		JButton btn_Play = new JButton("재생");

		btn_Play.setBounds(10, 640, 630, 50);

		GetMovies i = new GetMovies();

		Label q1 = new Label("2001");

		JButton btn_out = new JButton(new ImageIcon("이미지/뒤로가기.png"));
		btn_out.setBounds(5, 30, 50, 50);

		JButton btn_age = new JButton(new ImageIcon("이미지/전체.png"));
		btn_age.setBounds(70, 510, 30, 30);

		q1.setBounds(10, 500, 100, 50);
		q1.setFont(font);

		q1.setBackground(c);
		q1.setForeground(Color.WHITE);

		Label q2 = new Label(i.getAni_Totoro_Actor());
		q2.setBounds(10, 550, 400, 50);
		q2.setFont(font);

		q2.setBackground(c);
		q2.setForeground(Color.WHITE);

		Label q3 = new Label(i.getAni_Totoro_Name());
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

		ta.append(i.getAni_Totoro_Outline());

		f.add(btn_out);
		f.add(btn_age);

		f.add(q1);
		f.add(q2);
		f.add(q3);
		f.add(btn_Play);
		f.add(ta);

		btn_out.setBorderPainted(false);

		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setVisible(true);

		btn_out.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		
		String path = "애니_이웃집토토로";
		// 영상을 실행하기위해서 생성하는 객체
		GifPlayer ge = new GifPlayer();
		// 재생 버튼
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
