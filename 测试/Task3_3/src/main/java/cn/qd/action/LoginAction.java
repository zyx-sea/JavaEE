package cn.qd.action;

import com.opensymphony.xwork2.ActionSupport;
import cn.qd.action.User;

//�����û��ĵ�¼���˳�
public class LoginAction extends ActionSupport {
	//��־��¼��
	//public static Log logger = LogFactory.getLog(LogAction.class);
	//Ĭ�ϵ�½��ҳ
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
