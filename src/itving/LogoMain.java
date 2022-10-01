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
		f.setResizable(false);// 창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);// 창이 가운데 나오게

		// 폰트 설정 및 텍스트 설정
		Font text = new Font("", Font.BOLD, 20);
		Label q1 = new Label("ITVING 이용이 처음이신가요?");
		Label q2 = new Label("ITVING만의 영화 추천 기능을 이용해보세요");
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

		// 가이드, 검색 버튼 활성화
		JButton guide = new JButton(new ImageIcon("이미지/장르별보기.png"));
		JButton search = new JButton(new ImageIcon("이미지/영화검색.png"));
		f.add(guide);
		f.add(search);
		guide.setBounds(30, 300, 205, 205);
		search.setBounds(265, 300, 205, 205);

		// 사용할 이미지 불러오기
		ImageIcon img = new ImageIcon("이미지/color.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 500, 800);
		f.add(jl);
		f.setVisible(true);

		// 가이드 창 보여주는 이벤트 처리
		guide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Kategoriemain();
				f.dispose();
			}
		});

		// 선택된 영화 보여주는 창 이벤트 처리
		search.addActionListener(new ActionListener() {
			// SelectedMovies에서 Search로 변경
			@Override
			public void actionPerformed(ActionEvent e) {
				new Search();
				f.dispose();
			}

		});
		// x버튼 누르면 화면 꺼지게 이벤트 처리
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// x버튼을 감지하면 종료여부를 묻는 팝업프레임을 띄워주자
				// 중요!!! 익명클래스를 이용함
				f.dispose();
			}
		});
	}
}
