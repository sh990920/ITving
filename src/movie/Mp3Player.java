package movie;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Mp3Player extends Thread {
	// 파일 경로
	public String path;
	// 음악을 재생하는 플레이어 생성
	public Player player;

	@Override
	public void run() {
		// 음악을 재생시킨다
		play();

	}

	// 생성자로 항상 경로 잡아오기
	public Mp3Player(String path) {
		this.path = path;
	}

	public void play() {
		try {
			
			// 파일의 위치를 잡고 파일을 가져온다
			FileInputStream fi = new FileInputStream("영상/" + path + ".mp3");
			// 버퍼인풋스트림으로 더욱더 빠르게 가져올 수 있게 한다
			BufferedInputStream bi = new BufferedInputStream(fi);
			// 음악을 플레이 할 수 있게 해주는 플레이어에 파일 넣기
			player = new Player(bi);
			// 플레이어 작동 시작
			player.play();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}