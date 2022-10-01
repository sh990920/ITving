package itving;

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

import javax.swing.ImageIcon;
import javax.swing.JButton;

import movie.Action_JeonWoochi;
import movie.Action_SecretReunion;
import movie.Action_TheAgeOfShadows;
import movie.Action_TheGoodTheBadTheWeird;
import movie.Ani_Ponyo;
import movie.Ani_SenAndChihiro;
import movie.Ani_TheCatReturns;
import movie.Ani_Totoro;
import movie.Comedy_ExtremeJob;
import movie.Comedy_HotYoungBloods;
import movie.Comedy_SpeedScanda;
import movie.Comedy_Twenty;
import movie.Information;
import movie.Romance_Love911;
import movie.Romance_TheBeautyInside;
import movie.Romance_WolfBoy;
import movie.Romance_YourWedding;
import movie.SF_Haunters;
import movie.SF_ILLANG;
import movie.SF_SnowPiercer;
import movie.SF_SpaceSweepers;
import movie.Thriller_Gonjiam;
import movie.Thriller_HideAndSeek;
import movie.Thriller_ThePriests;
import movie.Thriller_TheWailing;

public class Search {
	// ������
	public Search() {
		Frame f = new Frame("SearchMovie");
		f.setBounds(500, 600, 500, 550);
		f.setBackground(new Color(56, 56, 56));
		f.setLayout(null);
		f.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);// â�� ��� ������
		// text�Է¿�
		Font font = new Font("", Font.PLAIN, 20);
		TextField tf = new TextField(10);
		tf.setBounds(100, 40, 220, 30);
		tf.setFont(font);

// ���� �������� �ѱ�� �ڵ�	
//------------------------------------------------------------------------------------------------------------------------------------
			
		JButton previous = new JButton(new ImageIcon("�̹���/previous.png"));
		previous.setBounds(15, 280, 50, 50);
		
		JButton next = new JButton(new ImageIcon("�̹���/next.png"));
		next.setBounds(430, 280, 50, 50);
		
		JButton previous2 = new JButton(new ImageIcon("�̹���/previous.png"));
		previous2.setBounds(15, 280, 50, 50);
		
		JButton next2 = new JButton(new ImageIcon("�̹���/next.png"));
		next2.setBounds(430, 280, 50, 50);
		
		JButton previous3 = new JButton(new ImageIcon("�̹���/previous.png"));
		previous3.setBounds(15, 280, 50, 50);
		
		JButton next3 = new JButton(new ImageIcon("�̹���/next.png"));
		next3.setBounds(430, 280, 50, 50);

		JButton previous4 = new JButton(new ImageIcon("�̹���/previous.png"));
		previous4.setBounds(15, 280, 50, 50);
		
		JButton next4 = new JButton(new ImageIcon("�̹���/next.png"));
		next4.setBounds(430, 280, 50, 50);
		
		JButton previous5 = new JButton(new ImageIcon("�̹���/previous.png"));
		previous5.setBounds(15, 280, 50, 50);
		
		JButton next5 = new JButton(new ImageIcon("�̹���/next.png"));
		next5.setBounds(430, 280, 50, 50);
		
		JButton previous6 = new JButton(new ImageIcon("�̹���/previous.png"));
		previous6.setBounds(15, 280, 50, 50);
		
		JButton next6 = new JButton(new ImageIcon("�̹���/next.png"));
		next6.setBounds(430, 280, 50, 50);
		
		JButton romance1 = new JButton(new ImageIcon("�̹���/�θǽ�_���ǰ�ȥ��.jpg"));
		romance1.setBounds(90, 100, 125, 188);
		
		JButton romance2 = new JButton(new ImageIcon("�̹���/�θǽ�_����ҳ�.jpg"));
		romance2.setBounds(280, 100, 125, 188);
		
		JButton romance3 = new JButton(new ImageIcon("�̹���/�θǽ�_��â��.jpg"));
		romance3.setBounds(90, 320, 125, 188);

		JButton romance4 = new JButton(new ImageIcon("�̹���/�θǽ�_��Ƽ�λ��̵�.jpg"));
		romance4.setBounds(280, 320, 125, 188);

		JButton thriller1 = new JButton(new ImageIcon("�̹���/������_����������.jpg"));
		thriller1.setBounds(90, 100, 125, 188);
		
		JButton thriller2 = new JButton(new ImageIcon("�̹���/������_�.jpg"));
		thriller2.setBounds(280, 100, 125, 188);
		
		JButton thriller3 = new JButton(new ImageIcon("�̹���/������_������.jpg"));
		thriller3.setBounds(90, 320, 125, 188);

		JButton thriller4 = new JButton(new ImageIcon("�̹���/������_���ٲ���.jpg"));
		thriller4.setBounds(280, 320, 125, 188);
		
		JButton ani1 = new JButton(new ImageIcon("�̹���/�ִ�_������Ǻ���.jpg"));
		ani1.setBounds(90, 100, 125, 188);
		
		JButton ani2 = new JButton(new ImageIcon("�̹���/�ִ�_������������.jpg"));
		ani2.setBounds(280, 100, 125, 188);
		
		JButton ani3 = new JButton(new ImageIcon("�̹���/�ִ�_����ġ���������Ҹ�.jpg"));
		ani3.setBounds(90, 320, 125, 188);

		JButton ani4 = new JButton(new ImageIcon("�̹���/�ִ�_�̿��������.jpg"));
		ani4.setBounds(280, 320, 125, 188);
		
		JButton action1 = new JButton(new ImageIcon("�̹���/�׼�_����.jpg"));
		action1.setBounds(90, 100, 125, 188);
		
		JButton action2 = new JButton(new ImageIcon("�̹���/�׼�_������.jpg"));
		action2.setBounds(280, 100, 125, 188);
		
		JButton action3 = new JButton(new ImageIcon("�̹���/�׼�_����ġ.jpg"));
		action3.setBounds(90, 320, 125, 188);

		JButton action4 = new JButton(new ImageIcon("�̹���/�׼�_�����𳪻۳��̻��ѳ�.jpg"));
		action4.setBounds(280, 320, 125, 188);
		
		JButton comedy1 = new JButton(new ImageIcon("�̹���/�ڹ̵�_���ӽ�ĵ��.jpg"));
		comedy1.setBounds(90, 100, 125, 188);
		
		JButton comedy2 = new JButton(new ImageIcon("�̹���/�ڹ̵�_��������.jpg"));
		comedy2.setBounds(280, 100, 125, 188);
		
		JButton comedy3 = new JButton(new ImageIcon("�̹���/�ڹ̵�_����.jpg"));
		comedy3.setBounds(90, 320, 125, 188);

		JButton comedy4 = new JButton(new ImageIcon("�̹���/�ڹ̵�_�ǲ���û��.jpg"));
		comedy4.setBounds(280, 320, 125, 188);
		
		JButton sf1 = new JButton(new ImageIcon("�̹���/sf_��������.jpg"));
		sf1.setBounds(90, 100, 125, 188);
		
		JButton sf2 = new JButton(new ImageIcon("�̹���/sf_�¸�ȣ.jpg"));
		sf2.setBounds(280, 100, 125, 188);
		
		JButton sf3 = new JButton(new ImageIcon("�̹���/sf_�ζ�.jpg"));
		sf3.setBounds(90, 320, 125, 188);

		JButton sf4 = new JButton(new ImageIcon("�̹���/sf_�ʴɷ���.jpg"));
		sf4.setBounds(280, 320, 125, 188);
		
		f.add(next);
		f.add(romance1);
		f.add(romance2);
		f.add(romance3);
		f.add(romance4);
		
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

        		f.add(next2);
        		f.add(previous2);
        		f.add(thriller1);
        		f.add(thriller2);
        		f.add(thriller3);
        		f.add(thriller4);
        		next.setVisible(false);
        		previous.setVisible(false);
        		next2.setVisible(true);
        		previous2.setVisible(true);
        		thriller1.setVisible(true);
            	thriller2.setVisible(true);
        		thriller3.setVisible(true);
        		thriller4.setVisible(true);
        		romance1.setVisible(false);
        		romance2.setVisible(false);
        		romance3.setVisible(false);
        		romance4.setVisible(false);
            }
        });
        
        next2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

        		f.add(next3);
        		f.add(previous3);
        		f.add(ani1);
        		f.add(ani2);
        		f.add(ani3);
        		f.add(ani4);
        		next2.setVisible(false);
        		previous2.setVisible(false);
        		next3.setVisible(true);
        		previous3.setVisible(true);
        		ani1.setVisible(true);
        		ani2.setVisible(true);
        		ani3.setVisible(true);
        		ani4.setVisible(true);
        		thriller1.setVisible(false);
            	thriller2.setVisible(false);
        		thriller3.setVisible(false);
        		thriller4.setVisible(false);
            }
        });
        
        next3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

        		f.add(next4);
        		f.add(previous4);
        		f.add(action1);
        		f.add(action2);
        		f.add(action3);
        		f.add(action4);
        		next3.setVisible(false);
        		previous3.setVisible(false);
        		next4.setVisible(true);
        		previous4.setVisible(true);
        		action1.setVisible(true);
        		action2.setVisible(true);
        		action3.setVisible(true);
        		action4.setVisible(true);
        		ani1.setVisible(false);
        		ani2.setVisible(false);
        		ani3.setVisible(false);
        		ani4.setVisible(false);

            }
        });
		
        next4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

        		f.add(next5);
        		f.add(previous5);
        		f.add(comedy1);
        		f.add(comedy2);
        		f.add(comedy3);
        		f.add(comedy4);
        		next4.setVisible(false);
        		previous4.setVisible(false);
        		next5.setVisible(true);
        		previous5.setVisible(true);
        		comedy1.setVisible(true);
        		comedy2.setVisible(true);
        		comedy3.setVisible(true);
        		comedy4.setVisible(true);
        		action1.setVisible(false);
        		action2.setVisible(false);
        		action3.setVisible(false);
        		action4.setVisible(false);
        	

            }
        });
        
        next5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

        		f.add(previous6);
        		f.add(sf1);
        		f.add(sf2);
        		f.add(sf3);
        		f.add(sf4);
        		next5.setVisible(false);
        		previous5.setVisible(false);
        		previous6.setVisible(true);
        		
        		sf1.setVisible(true);
        		sf2.setVisible(true);
        		sf3.setVisible(true);
        		sf4.setVisible(true);
        		comedy1.setVisible(false);
        		comedy2.setVisible(false);
        		comedy3.setVisible(false);
        		comedy4.setVisible(false);

            }
        });
        
        
        previous6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	next5.setVisible(true);
            	previous5.setVisible(true);
            	previous6.setVisible(false);
            	sf1.setVisible(false);
            	sf2.setVisible(false);
        		sf3.setVisible(false);
        		sf4.setVisible(false);
        		comedy1.setVisible(true);
        		comedy2.setVisible(true);
        		comedy3.setVisible(true);
        		comedy4.setVisible(true);
            }
        });
        
        previous5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	next4.setVisible(true);
            	previous4.setVisible(true);
            	next5.setVisible(false);
            	previous5.setVisible(false);
            	comedy1.setVisible(false);
            	comedy2.setVisible(false);
            	comedy3.setVisible(false);
            	comedy4.setVisible(false);
        		action1.setVisible(true);
        		action2.setVisible(true);
        		action3.setVisible(true);
        		action4.setVisible(true);
            }
        });
        
        previous4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	next3.setVisible(true);
            	previous3.setVisible(true);
            	next4.setVisible(false);
            	previous4.setVisible(false);
            	action1.setVisible(false);
            	action2.setVisible(false);
            	action3.setVisible(false);
            	action4.setVisible(false);
        		ani1.setVisible(true);
        		ani2.setVisible(true);
        		ani3.setVisible(true);
        		ani4.setVisible(true);
            }
        });
        
        previous3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	next2.setVisible(true);
            	previous2.setVisible(true);
            	next3.setVisible(false);
            	previous3.setVisible(false);
            	ani1.setVisible(false);
            	ani2.setVisible(false);
            	ani3.setVisible(false);
            	ani4.setVisible(false);
        		thriller1.setVisible(true);
        		thriller2.setVisible(true);
        		thriller3.setVisible(true);
        		thriller4.setVisible(true);
            }
        });
        
        previous2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	next.setVisible(true);
            	next2.setVisible(false);
            	previous2.setVisible(false);
            	thriller1.setVisible(false);
            	thriller2.setVisible(false);
        		thriller3.setVisible(false);
        		thriller4.setVisible(false);
        		romance1.setVisible(true);
        		romance2.setVisible(true);
        		romance3.setVisible(true);
        		romance4.setVisible(true);
            }
        });
// ���� �������� �ѱ�� �ڵ�	
//------------------------------------------------------------------------------------------------------------------------------------
		
		Button btn_search = new Button("�Է�");
		btn_search.setBounds(350, 40, 55, 30);

		btn_search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���⼭ �˻� �ϸ��
				//sf
				if (tf.getText().trim().equalsIgnoreCase("��������")) {
					new SF_SnowPiercer();
				}
				if (tf.getText().trim().equalsIgnoreCase("�¸�ȣ")) {
					new SF_SpaceSweepers();
				}
				if (tf.getText().trim().equalsIgnoreCase("�ζ�")) {
					new SF_ILLANG();
				}
				if (tf.getText().trim().equalsIgnoreCase("�ʴɷ���")) {
					new SF_Haunters();
				}
				//�θǽ�
				if (tf.getText().trim().equalsIgnoreCase("���ǰ�ȥ��")) {
					new Romance_YourWedding();
				}
				if (tf.getText().trim().equalsIgnoreCase("����ҳ�")) {
					new Romance_WolfBoy();
				}
				if (tf.getText().trim().equalsIgnoreCase("��â��")) {
					new Romance_Love911();
				}
				if (tf.getText().trim().equalsIgnoreCase("��Ƽ�λ��̵�")) {
					new Romance_TheBeautyInside();
				}
				//������
				if (tf.getText().trim().equalsIgnoreCase("����������")) {
					new Thriller_ThePriests();
				}
				if (tf.getText().trim().equalsIgnoreCase("�")) {
					new Thriller_TheWailing();
				}
				if (tf.getText().trim().equalsIgnoreCase("������")) {
					new Thriller_Gonjiam();
				}
				if (tf.getText().trim().equalsIgnoreCase("���ٲ���")) {
					new Thriller_HideAndSeek();
				}
				//�ִ�
				if (tf.getText().trim().equalsIgnoreCase("������������")) {
					new Ani_Ponyo();
				}
				if (tf.getText().trim().equalsIgnoreCase("������Ǻ���")) {
					new Ani_TheCatReturns();
				}
				if (tf.getText().trim().equalsIgnoreCase("����ġ���������Ҹ�")) {
					new Ani_SenAndChihiro();
				}
				if (tf.getText().trim().equalsIgnoreCase("�̿��������")) {
					new Ani_Totoro();
				}
				//�׼�
				if (tf.getText().trim().equalsIgnoreCase("����")) {
					new Action_TheAgeOfShadows();
				}
				if (tf.getText().trim().equalsIgnoreCase("������")) {
					new Action_SecretReunion();
				}
				if (tf.getText().trim().equalsIgnoreCase("����ġ")) {
					new Action_JeonWoochi();
				}
				if (tf.getText().trim().equalsIgnoreCase("�����𳪻۳��̻��ѳ�")) {
					new Action_TheGoodTheBadTheWeird();
				}
				//�ڹ̵�
				if (tf.getText().trim().equalsIgnoreCase("���ӽ�ĵ��")) {
					new Comedy_SpeedScanda();
				}
				if (tf.getText().trim().equalsIgnoreCase("��������")) {
					new Comedy_ExtremeJob();
				}
				if (tf.getText().trim().equalsIgnoreCase("����")) {
					new Comedy_Twenty();
				}
				if (tf.getText().trim().equalsIgnoreCase("�ǲ���û��")) {
					new Comedy_HotYoungBloods();
				}
			}
		});
		
		JButton btn_out = new JButton(new ImageIcon("�̹���/�ڷΰ���.png"));
		btn_out.setBounds(10, 40, 50, 50);
		btn_out.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new LogoMain();
				f.dispose();
				
			}
		});
		
		//��ư Ȱ��ȭ
		//sf
		sf1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_SnowPiercer();
			}
		});
		sf2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_SpaceSweepers();
			}
		});
		sf3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_ILLANG();
			}
		});
		sf4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_Haunters();
			}
		});
		//�θǽ�
		romance1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_YourWedding();
			}
		});
		romance2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_WolfBoy();
			}
		});
		romance3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_Love911();
			}
		});
		romance4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_TheBeautyInside();
			}
		});
		//������
		thriller1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_ThePriests();
			}
		});
		thriller2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_TheWailing();
			}
		});
		thriller3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_Gonjiam();
			}
		});
		thriller4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_HideAndSeek();
			}
		});
		//�ִ�
		ani1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ani_TheCatReturns();
			}
		});
		ani2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ani_Ponyo();
			}
		});
		ani3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ani_SenAndChihiro();
			}
		});
		ani4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ani_Totoro();
			}
		});
		//�׼�
		action1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_TheAgeOfShadows();
			}
		});
		action2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_SecretReunion();
			}
		});
		action3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_JeonWoochi();
			}
		});
		action4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_TheGoodTheBadTheWeird();
			}
		});
		//�ڹ̵�
		comedy1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_SpeedScanda();
			}
		});
		comedy2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_ExtremeJob();
			}
		});
		comedy3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_Twenty();
			}
		});
		comedy4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_HotYoungBloods();
			}
		});
		
		f.add(tf);
		f.add(btn_search);
		f.add(btn_out);
		f.setVisible(true);
		btn_out.setBorderPainted(false);
		// â�ݱ�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

	}

}
