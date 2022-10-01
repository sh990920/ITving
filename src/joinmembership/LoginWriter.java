package joinmembership;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class LoginWriter {
	FileOutputStream fos = null;
	ObjectOutputStream  os = null;
	public LoginWriter(LoginInfo info) {
		String path = "C:/ITving/UserInfo/"+info.getId() + "/UserInfo.txt";
		
		File dir = new File("C:/ITving/UserInfo/"+info.getId());
		
		if(!dir.exists()) {
			dir.mkdirs();
		}
		try {
			fos = new FileOutputStream(path);
			os = new ObjectOutputStream(fos);
			os.writeObject(info);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ȸ�����Կ� �����ϼ̽��ϴ�.");
		}
		finally {
			try {
				fos.close();
				os.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}


}

