package cn.qd.zhou;

public class LoginAction {
	private String username;
	private String userpassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	public String execute(){
		String str=null;
		if(username.equals("zhou")&&userpassword.equals("123")){
			str="success";
		}
		else{
			str="login";
		}
		return str;
		
	}
}
