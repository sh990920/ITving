package joinmembership;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JOptionPane;

import itving.LogoMain;
import itving.LogoOffset;

public class LoginWindow {
	public LoginWindow() {

		Frame f = new Frame("로그인");

		f.setBounds(450, 150, 330, 200);
		f.setBackground(new Color(56, 56, 56));
		f.setLayout(null);
		f.setResizable(false);// 창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);// 창이 가운데 나오게
		// 폰트
		Font font = new Font("", Font.PLAIN, 15); // id,pw font
		Font text = new Font("", Font.BOLD, 20);
		// text font

		// Label: Id, Pw
		Label q1 = new Label("Id: ");
		q1.setForeground(Color.orange);
		q1.setBounds(20, 40, 60, 20);
		q1.setFont(text);
		f.add(q1);
		Label q2 = new Label("Pw: ");
		q2.setForeground(Color.orange);
		q2.setBounds(20, 100, 60, 20);
		q2.setFont(text);
		f.add(q2);

		// 키보드에서 값을 입력받기 위한 입력상자
		TextField id = new TextField(10); // id
		TextField pw = new TextField(10); // pw
		pw.setEchoChar('*'); // 비밀번호의 입력을 *모양으로 표시되도록 설정

		// 입력창 위치 조정 및 폰트 적용
		id.setBounds(80, 40, 150, 25);
		pw.setBounds(80, 100, 150, 25);

		id.setFont(font);
		pw.setFont(font);
		f.add(id);
		f.add(pw);

		// 확인, 취소, id 찾기, pw 찾기 버튼
		Button btn_login = new Button("로그인");
		Button btn_cancel = new Button("취소");
		Button btn_findId = new Button("Id 찾기");
		Button btn_findPw = new Button("Pw 찾기");
		Button btn_membershipjoin = new Button("회원가입");
		btn_login.setBounds(70, 150, 80, 30); // 중복확인
		btn_cancel.setBounds(170, 150, 80, 30); // 가입
		btn_findId.setBounds(255, 42, 60, 20); // 가입
		btn_findPw.setBounds(255, 102, 60, 20); // 가입
		f.add(btn_login);
		f.add(btn_cancel);
		f.add(btn_findId);
		f.add(btn_findPw);

		// 로그인 버튼 이벤트 처리 활성화
		btn_login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginInfo info = new LoginInfo();

				String q_id = id.getText(); /// question id
				String q_pw = ""; // question pw
				info.setId(q_id);
				LoginLoader loader = new LoginLoader(info);
				q_pw = loader.getInfo().getPw();
				info.setPw(q_pw);
				if (id.getText().equals(q_id) && pw.getText().equals(q_pw)) {
					JOptionPane.showMessageDialog(null, q_id + " 님 환영합니다.");
					new LogoOffset();
//					new LogoMain();
					f.dispose();
				} // if

				else if (id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "id를 입력해주세요");
				} else {

					JOptionPane.showMessageDialog(null, "id 혹은 pw를 확인해주세요");
				}
			}
		});
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭된 버튼에 부착된 텍스트를 가져온다
				String select = e.getActionCommand();
				switch (select) {
				case "Id 찾기":
					new FindId();
					break;
				case "Pw 찾기":
					new FindPw();
					break;
				case "취소":
					f.dispose();
					break;
				}
			}
		};
		btn_findId.addActionListener(al);
		btn_findPw.addActionListener(al);
		btn_cancel.addActionListener(al);

		// 창끄는 기능 삽입
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// x버튼을 감지하면 종료여부를 묻는 팝업프레임을 띄워주자
				// 중요!!! 익명클래스를 이용함
				f.dispose();
			}
		});

		f.setVisible(true);
	}// Generators
}
