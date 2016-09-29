package cn.qd.action;

import com.opensymphony.xwork2.ActionSupport;
import cn.qd.action.User;

//用于用户的登录与退出
public class LoginAction extends ActionSupport {
	//日志记录类
	//public static Log logger = LogFactory.getLog(LogAction.class);
	//默认登陆首页
	private static final String INDEX = "index";
	private String username;
	private String userpassword;
	
	public String toLogin(){
		String result = LOGIN;
		return result;
		/*if(LoginManager.isOnline()){
			
		}*/
	}
}
