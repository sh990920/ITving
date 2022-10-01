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

public class FindPw {
	public FindPw() {
		Frame f = new Frame("pw 찾기");

		f.setBounds(450, 150, 330, 200);
		f.setBackground(new Color(56,56,56));
		f.setLayout(null);
		f.setResizable(false);//창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);//창이 가운데 나오게
		// 폰트
		Font font = new Font("", Font.PLAIN, 15); // id, email font
		Font text = new Font("", Font.BOLD, 20);
		// text font

		// Label: name, email
		Label q1 = new Label("Id: ");
		q1.setBounds(20, 40, 60, 20);
		q1.setForeground(Color.orange);
		q1.setFont(text);
		f.add(q1);
		Label q2 = new Label("Email: ");
		q2.setBounds(20, 100, 60, 20);
		q2.setForeground(Color.orange);
		q2.setFont(text);
		f.add(q2);

		// 키보드에서 값을 입력받기 위한 입력상자
		TextField id = new TextField(10); // name
		TextField email = new TextField(35); // email

		// 입력창 위치 조정 및 폰트 적용
		id.setBounds(90, 40, 150, 25);
		email.setBounds(90, 100, 150, 25);

		id.setFont(font);
		email.setFont(font);
		f.add(id);
		f.add(email);

		// pw 찾기 취소 버튼
		Button btn_find = new Button("찾기");
		Button btn_cancel = new Button("취소");
		btn_find.setBounds(70, 150, 70, 20); // pw 찾기
		btn_cancel.setBounds(170, 150, 70, 20); // 취소
		f.add(btn_find);
		f.add(btn_cancel);

		// 취소버튼 이벤트 처리
		btn_cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		// pw 찾기 이벤트 활성화
		btn_find.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String q_id = id.getText(); // question id
				String q_email = email.getText(); // question email
				String s_id = ""; // save name
				String s_email = ""; // save email
				String pw = ""; // 가져올 비밀번호
				String path = "C:/ITving/UserInfo/";
				File f1 = new File(path);
				LoginInfo info = new LoginInfo();
				if (f1.isDirectory()) {
					File[] idlist = f1.listFiles();

					for (int i = 0; i < idlist.length; i++) {
						info.setId(idlist[i].getName());

						LoginLoader loader = new LoginLoader(info);
						s_id = loader.getInfo().getId();
						s_email = loader.getInfo().getEmail();
						pw = loader.getInfo().getPw();
						if (q_id.equals(s_id) && q_email.equals(s_email)) {
							JOptionPane.showMessageDialog(null, "회원님의 pw는 " + pw + " 입니다");
							f.dispose();
							  break;
						} // inner if
					}//for
					  if ( !(q_id.equals(s_id)) || !(q_email.equals(q_email)))
		                {
		                   JOptionPane.showMessageDialog(null, "존재하는 회원정보가 없습니다.");
		                }
					} // outer if
				}
		});

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
	}
}
