package processAction;

import java.util.Map;
import java.util.regex.Pattern;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class aichen extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	// ��ҪУ����ֶα����������ṩ��Ӧ���ֶκ���Ӧ��get,set����
	private String username;
	private String password;
	private String repassword;
	private String age;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	private Map session;

	public void setSession(Map session) {
		this.session = session;
	}
	
	public String execute(){
		System.out.println(username);
		this.session.put("USER_NAME", username);
		if(username.isEmpty()) {
			return "input";
		}
		else {
			
			return SUCCESS;
		}
	}

	
//	   public void validate() {  //������е�Action������ 
//	        if(username == null ||"".equals(this.username.trim())){ 
//	            this.addFieldError("username", "�û�������Ϊ��"); 
//	        } 
//	        if(password == null ||"".equals(this.password.trim())){ 
//	           this.addFieldError("mobile", "�ֻ��Ų���Ϊ��"); 
//	        }else{ 
//	        if(!Pattern.compile("^1[3,5,8]\\d{9}$").matcher(this.age).matches()){ 
//	                this.addFieldError("mobile","�ֻ��Ÿ�ʽ����ȷ") ;   
//	            } 
//	        } 
//	       super.validate(); 
//	    } 
	
	


}