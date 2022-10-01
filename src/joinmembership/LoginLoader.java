package joinmembership;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoginLoader {

		private LoginInfo info;
		public LoginInfo getInfo() {
			return info;
		}
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		public LoginLoader(LoginInfo info) {
			this.info = info;
			
			String path = "C:/ITving/UserInfo/"+info.getId() + "/UserInfo.txt";
			File f = new File(path);
			
			if(f.exists()) {
				try {
					fis = new FileInputStream(path);
					ois = new ObjectInputStream(fis);
					
					this.info = (LoginInfo)ois.readObject();
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			finally {
				try {
					fis.close();
					ois.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			}//if
		}

}
