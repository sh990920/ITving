package itving;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LogoOffset  {
	//������ ���� �� start�� ��Ű�� ���
	
	public LogoOffset(){
		
		Frame f = new Frame("Logo");
		f.setLayout(null);
		f.setBounds(550, 150, 450, 320);
		f.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);//â�� ��� ������
		
		//��Ʈ ���� �� �ؽ�Ʈ ����
				Font text = new Font("", Font.BOLD, 70);
				Label q1 = new Label("ITVING");
				q1.setBounds(105, 110, 280, 50);
				q1.setFont(text);
				q1.setForeground(Color.white);
				
				f.setBackground(new Color(56,56,56));
				f.add(q1);
		
		
		f.setVisible(true);
		
		
		try{
			Thread.sleep(1000);
			// Frame Ȱ��ȭ�� ��� ����
			f.addWindowListener(new WindowAdapter() {
				@Override
				public void windowActivated(WindowEvent e) {
					try {
						f.dispose();
						new LogoMain();
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}	
			});
			
		}catch(InterruptedException e){
		}
	}
	
	
	}
