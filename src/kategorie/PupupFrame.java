package kategorie;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PupupFrame {
	public PupupFrame() {
		
		Frame f = new Frame("종료");
		f.setLayout(null);
		
		f.setBounds(550, 550, 300, 200);
		
		f.setResizable(false);//창의 크기를 변경하지 못하게
		   f.setLocationRelativeTo(null);//창이 가운데 나오게
		
		Font font = new Font("굴림체", Font.BOLD, 20);
		
		Label q1 = new Label("정말 종료하시겠습니까??");
		q1.setBounds(30, 50, 250, 50);
		q1.setFont(font);
		f.add(q1);
		
		Button btn_exit = new Button("종료");
		Button btn_cancel = new Button("취소");
		
		btn_exit.setBounds(30, 110, 100, 50);
		btn_cancel.setBounds(170, 110, 100, 50);
		
		btn_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btn_cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		
		f.add(btn_exit);
		f.add(btn_cancel);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}	
}
