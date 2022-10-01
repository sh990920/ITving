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
//				//fis가 읽어온 내용을 b_read배열에 순차적으로 저장함 
//				fis.read(b_read);
//				//b_read배열에 담긴 내용을 문자열 구조로 재조립 하는 기능 -> String class 
//				String str = new String(b_read);
//				System.out.println(str);
//				fis.close(); //사용이 완료된 스트림은 반드시 닫아주어야 한다. (중요!!)
//			} catch (Exception e) {
//			}
//			
//		}//if
//				

		
		ObjectInputStream ois = null;
		try {
			// 파일에 저장된 객체를 읽어들이기 위해 ObjectInputStream 객체 생성
			ois = new ObjectInputStream(new FileInputStream("C:\\ITving\\UserInfo\\sh990920\\UserInfo.txt"));

			// ObjectInputStream 은 스트림으로 부터 읽어들인 직렬화된 객체를 역직렬화해서 객체를 생성할 수 있다.
			// 역직렬화할때 필요한 클래스 파일을 찾지 못할 경우
			// ClassNotFoundException 을 발생시킴.
			LoginInfo li = (LoginInfo) ois.readObject();

			System.out.println("이름 : " + li.getName());
			System.out.println("아이디 : " + li.getId());
			System.out.println("비밀번호 : " + li.getPw());
			System.out.println("메일 : " + li.getEmail());
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



