package movie;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GifPlayer extends JFrame {
	
	//경로 지정
	String path;
	//mp3생성
	Mp3Player mp3;
	
	//영화제목을 경로로 받아오게 하기위해서 파라미터로 값을 받는다
	public void newMovie(String path) {
		this.path = path;
		setLayout(null);
		setBounds(646, 150, 630, 400);
		setResizable(false);
		setVisible(true);
		//mp3클래스를 생성한다(파일 경로는 똑같이 영화제목으로)
		mp3 = new Mp3Player(path);
		//mp3스레드 작동 시작
		mp3.start();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				//창을 닫으면 백그라운드로 실행되는 mp3클래스도 종료
				mp3.stop();
			}
		});
	}
	
	
	public void playMovie() {
		//gif파일을 가져오는 경로 설정
		ImageIcon img = new ImageIcon("영상/" + path + ".gif");
		//새로운 창을 띄워서 작동시킨다
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 400);
		add(jl);
		repaint();

	}
}
