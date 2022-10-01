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
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class MembershipJoin {
	public MembershipJoin() {
		Frame f = new Frame("회원가입");

		f.setBounds(450, 150, 330, 300);
		f.setBackground(new Color(56, 56, 56));
		f.setLayout(null);

		f.setResizable(false);// 창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);// 창이 가운데 나오게
		// 폰트
		Font font = new Font("", Font.PLAIN, 10); // name, id, pw, email font
		Font text = new Font("", Font.BOLD, 10);
		// font.PLAIN이 폰트 기본상태를 말함

		// Label: Name, Id, Pw, Email
		Label q1 = new Label("Name: ");
		q1.setBounds(10, 40, 60, 20);
		q1.setForeground(Color.orange);
		q1.setFont(text);
		f.add(q1);
		Label q2 = new Label("Id: ");
		q2.setBounds(10, 100, 60, 20);
		q2.setForeground(Color.orange);
		q2.setFont(text);
		f.add(q2);
		Label q3 = new Label("Pw: ");
		q3.setBounds(10, 160, 60, 20);
		q3.setForeground(Color.orange);
		q3.setFont(text);
		f.add(q3);
		Label q4 = new Label("Email: ");
		q4.setBounds(10, 220, 60, 20);
		q4.setForeground(Color.orange);
		q4.setFont(text);
		f.add(q4);

		// 키보드에서 값을 입력받기 위한 입력상자
		TextField name = new TextField("name",10); // name
		TextField id = new TextField(10); // id
		TextField pw = new TextField(15); // pw
		TextField email = new TextField(30); // email
		pw.setEchoChar('*'); // 비밀번호의 입력을 *모양으로 표시되도록 설정

		// 입력창 위치 조정 및 폰트 적용
		name.setBounds(70, 40, 170, 20);
		id.setBounds(70, 100, 170, 20);
		pw.setBounds(70, 160, 170, 20);
		email.setBounds(70, 220, 170, 20);
		name.setFont(font);
		id.setFont(font);
		pw.setFont(font);
		email.setFont(font);
		f.add(name);
		f.add(id);
		f.add(pw);
		f.add(email);

		Button btn_overlapping = new Button("중복확인");
		Button btn_join = new Button("회원가입");
		Button btn_cancel = new Button("취소");
		btn_overlapping.setBounds(250, 100, 50, 20); // 중복확인
		btn_join.setBounds(70, 250, 80, 40); // 가입
		btn_cancel.setBounds(180, 250, 80, 40); // 가입
		f.add(btn_overlapping);
		f.add(btn_join);
		f.add(btn_cancel);

		// name, id, pw, email중 하나라도 공백란이 있으면 가입 불가능처리
		if (name.getText().trim().equals("") || id.getText().trim().equals("") || pw.getText().trim().equals("")
				|| email.getText().trim().equals("")) {

			btn_join.setEnabled(false);
		} // if

		// id 중복확인 승인을 받아야 회원가입 버튼을 활성화
		btn_overlapping.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = "C:/ITving/UserInfo/" + id.getText();
				File f = new File(path);
				if (id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "id를 입력해주세요");
					btn_join.setEnabled(false);
				} // if
				else if (f.exists()) {
					JOptionPane.showMessageDialog(null, "해당 id는 존재하는 id입니다.");
					btn_join.setEnabled(false);
				} // else if
				if (!f.exists() && !(name.getText().isEmpty()) && !(id.getText().isEmpty())) {
					JOptionPane.showMessageDialog(null, "사용가능한 id입니다.");
					btn_join.setEnabled(true);
				} // if

			}
		});

		// 회원가입 이벤트 처리
		btn_join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 이메일 패턴 생성 ex) (영어 or 숫자 or (-,_,.) @ (영어 or 숫자 or (-,_,.) . (영어 or 숫자)
				String pattern = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";

				if (!(name.getText().isEmpty()) && !(id.getText().isEmpty()) && !(pw.getText().isEmpty())
						&& !(email.getText().isEmpty()) && Pattern.matches(pattern, email.getText())) {
					LoginInfo info = new LoginInfo();
					info.LoginInfo(name.getText(), id.getText(), pw.getText(), email.getText());
					new LoginWriter(info);
					JOptionPane.showMessageDialog(null, "회원가입이 성공적으로 되었습니다.");
					f.dispose();
				}

				// email 양식이 제대로 적히지 않으면 회원가입 불가능 처리
				else {
					JOptionPane.showMessageDialog(null, "올바른 이메일 양식이 아닙니다. 다시 입력해주세요");
				}

			}
		});

		// 취소 이벤트 처리
		btn_cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		// 창 끄는 이벤트 처리
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		f.setVisible(true);
	}
}
