package joinmembership;

import java.io.Serializable;

public class LoginInfo implements Serializable {
	private String id, pw, name, email; 
	
	public void LoginInfo(String name, String id, String pw, String email) {
	this.name = name;
	this.id = id;
	this.pw = pw;
	this.email = email;
	}
	
		
		
	public String getId() {
		return id;
		
	}
	public void setId(String id) {
		this.id = id; 
	}
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
