package administrator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.crypto.Data;

import joinmembership.LoginInfo;

public class CustomerInfo {
	public static void main(String[] args) {
//		String path ="C:/ITving/UserInfo/pipo36/UserInfo.txt";
//		File f = new File(path);
//		byte b_read[] = new byte [(int) f.length()];
//		
//		
//		if(f.exists()) {
//			
//			try {
//				FileInputStream fis = new FileInputStream(f);
//				//fis�� �о�� ������ b_read�迭�� ���������� ������ 
//				fis.read(b_read);
//				//b_read�迭�� ��� ������ ���ڿ� ������ ������ �ϴ� ��� -> String class 
//				String str = new String(b_read);
//				System.out.println(str);
//				fis.close(); //����� �Ϸ�� ��Ʈ���� �ݵ�� �ݾ��־�� �Ѵ�. (�߿�!!)
//			} catch (Exception e) {
//			}
//			
//		}//if
//				

		
		ObjectInputStream ois = null;
		try {
			// ���Ͽ� ����� ��ü�� �о���̱� ���� ObjectInputStream ��ü ����
			ois = new ObjectInputStream(new FileInputStream("C:\\ITving\\UserInfo\\sh990920\\UserInfo.txt"));

			// ObjectInputStream �� ��Ʈ������ ���� �о���� ����ȭ�� ��ü�� ������ȭ�ؼ� ��ü�� ������ �� �ִ�.
			// ������ȭ�Ҷ� �ʿ��� Ŭ���� ������ ã�� ���� ���
			// ClassNotFoundException �� �߻���Ŵ.
			LoginInfo li = (LoginInfo) ois.readObject();

			System.out.println("�̸� : " + li.getName());
			System.out.println("���̵� : " + li.getId());
			System.out.println("��й�ȣ : " + li.getPw());
			System.out.println("���� : " + li.getEmail());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}



