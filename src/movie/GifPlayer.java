package movie;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GifPlayer extends JFrame {
	
	//��� ����
	String path;
	//mp3����
	Mp3Player mp3;
	
	//��ȭ������ ��η� �޾ƿ��� �ϱ����ؼ� �Ķ���ͷ� ���� �޴´�
	public void newMovie(String path) {
		this.path = path;
		setLayout(null);
		setBounds(646, 150, 630, 400);
		setResizable(false);
		setVisible(true);
		//mp3Ŭ������ �����Ѵ�(���� ��δ� �Ȱ��� ��ȭ��������)
		mp3 = new Mp3Player(path);
		//mp3������ �۵� ����
		mp3.start();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				//â�� ������ ��׶���� ����Ǵ� mp3Ŭ������ ����
				mp3.stop();
			}
		});
	}
	
	
	public void playMovie() {
		//gif������ �������� ��� ����
		ImageIcon img = new ImageIcon("����/" + path + ".gif");
		//���ο� â�� ����� �۵���Ų��
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 400);
		add(jl);
		repaint();

	}
}
