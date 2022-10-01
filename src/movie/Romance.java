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

public class Romance {
	public Romance() {
		Frame f = new Frame("Romance");
		f.setLayout(null);
		f.setBounds(500, 600, 630, 1000);
		f.setResizable(false);// 창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);// 창이 가운데 나오게
		// 영화 포스터
		JButton a1 = new JButton(new ImageIcon("이미지/로맨스_너의 결혼식.png"));
		JButton a2 = new JButton(new ImageIcon("이미지/로맨스_늑대소년.png"));
		JButton a3 = new JButton(new ImageIcon("이미지/로맨스_반창꼬.png"));
		JButton a4 = new JButton(new ImageIcon("이미지/로맨스_뷰티인사이드.png"));

		// 포스터 크기
		a1.setBounds(50, 270, 250, 330);
		a2.setBounds(330, 270, 250, 330);
		a3.setBounds(50, 630, 250, 330);
		a4.setBounds(330, 630, 250, 330);

		// 추가
		f.add(a1);
		f.add(a2);
		f.add(a3);
		f.add(a4);

		// 뒤로가기
		JButton btn_logout = new JButton(new ImageIcon("이미지/뒤로가기.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);

		// 외곽선 지우기
		a1.setBorderPainted(false);
		a2.setBorderPainted(false);
		a3.setBorderPainted(false);
		a4.setBorderPainted(false);

		// 배경
		ImageIcon img = new ImageIcon("이미지/로맨스영화배경.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);

		f.setVisible(true);
		
		a1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_YourWedding();
				
			}
		});
		a2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_WolfBoy();
				
			}
		});
		a3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_Love911();
				
			}
		});
		a4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_TheBeautyInside();
				
			}
		});
		
		btn_logout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
		});
		
		// 종료
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 정말 종료? 팝업창
				new PupupFrame();
			}
		});
	}

}
