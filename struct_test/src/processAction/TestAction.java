package processAction;

import java.util.Map;
import java.util.regex.Pattern;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	// ��ҪУ����ֶα����������ṩ��Ӧ���ֶκ���Ӧ��get,set����
	private String email;
	private String password;
	private String repassword;
	private String phone;

	
	private Map session;

	public void setSession(Map session) {
		this.session = session;
	}
	
	public String execute(){
		System.out.println(email);
		this.session.put("USER_NAME", email);
		if(email.isEmpty()) {
			return "input";
		}
		else {
			
			return SUCCESS;
		}
	}

	
//	   public void validate() {  //������е�Action������ 
//	        if(email == null ||"".equals(this.email.trim())){ 
//	            this.addFieldError("username", "�û�������Ϊ��"); 
//	        } 
//	        if(password == null ||"".equals(this.password.trim())){ 
//	           this.addFieldError("mobile", "�ֻ��Ų���Ϊ��"); 
//	        }else{ 
//	        if(!Pattern.compile("^1[3,5,8]\\d{9}$").matcher(this.phone).matches()){ 
//	                this.addFieldError("mobile","�ֻ��Ÿ�ʽ����ȷ") ;   
//	            } 
//	        } 
//	       super.validate(); 
//	    } 
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}