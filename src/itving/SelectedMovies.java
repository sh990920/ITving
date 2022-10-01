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
import javax.swing.JOptionPane;

import joinmembership.LoginInfo;
import joinmembership.LoginWindow;
import joinmembership.LoginWriter;
import joinmembership.MembershipJoin;

public class SelectedMovies {

	String road = "";

	public String text(String road) {

		System.out.println(road);
		return this.road = road;
	}

	public SelectedMovies() {

		Frame f = new Frame("SelectedMovies");
		f.setBackground(new Color(56, 56, 56));
		f.setBounds(500, 600, 500, 550);
		f.setLayout(null);
		f.setResizable(false);// 창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);// 창이 가운데 나오게

		// 폰트 설정 및 텍스트 설정
		Font text = new Font("", Font.BOLD, 20);
		Label q1 = new Label("내가 선택한 영화");
		q1.setBounds(170, 55, 180, 50);
		q1.setFont(text);
		q1.setForeground(Color.ORANGE);
		q1.setBackground(new Color(56, 56, 56));
		f.add(q1);

		// 가이드, 검색 버튼 활성화
		JButton selectedMovie1 = new JButton(new ImageIcon("이미지/" + road + ".png"));
		Button selectedMovie2 = new Button();
		Button selectedMovie3 = new Button();
		Button selectedMovie4 = new Button();
		Button backPage = new Button();
		f.add(selectedMovie1);
		f.add(selectedMovie2);
		f.add(selectedMovie3);
		f.add(selectedMovie4);
		f.add(backPage);
		selectedMovie1.setBounds(265, 300, 205, 205);
//	selectedMovie2.setBounds(265,300,205,205);
//	selectedMovie3.setBounds(265,300,205,205);
//	selectedMovie4.setBounds(265,300,205,205);
		backPage.setBounds(135, 300, 50, 50);

		// selectedMovie1
		selectedMovie1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//여기에 작업
				new Search();
			}

		});

		// selectedMovie2
		selectedMovie2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});

		// selectedMovie3
		selectedMovie3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});

		// selectedMovie4
		selectedMovie4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});

		// backpage
		backPage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			new LogoMain();
			f.dispose();
			}
			
		});
		// x버튼 누르면 화면 꺼지게 이벤트 처리
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// x버튼을 감지하면 종료여부를 묻는 팝업프레임을 띄워주자
				// 중요!!! 익명클래스를 이용함
				System.exit(0);
			}

		});

		f.setVisible(true);
	}
}
