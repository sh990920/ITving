package movie;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Mp3Player extends Thread {
	// ���� ���
	public String path;
	// ������ ����ϴ� �÷��̾� ����
	public Player player;

	@Override
	public void run() {
		// ������ �����Ų��
		play();

	}

	// �����ڷ� �׻� ��� ��ƿ���
	public Mp3Player(String path) {
		this.path = path;
	}

	public void play() {
		try {
			
			// ������ ��ġ�� ��� ������ �����´�
			FileInputStream fi = new FileInputStream("����/" + path + ".mp3");
			// ������ǲ��Ʈ������ ����� ������ ������ �� �ְ� �Ѵ�
			BufferedInputStream bi = new BufferedInputStream(fi);
			// ������ �÷��� �� �� �ְ� ���ִ� �÷��̾ ���� �ֱ�
			player = new Player(bi);
			// �÷��̾� �۵� ����
			player.play();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}