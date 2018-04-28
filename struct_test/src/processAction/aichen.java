package processAction;

import java.util.Map;
import java.util.regex.Pattern;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class aichen extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	// 需要校验的字段必需在类中提供相应的字段和相应的get,set方法
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

	
//	   public void validate() {  //会对所有的Action起作用 
//	        if(username == null ||"".equals(this.username.trim())){ 
//	            this.addFieldError("username", "用户名不能为空"); 
//	        } 
//	        if(password == null ||"".equals(this.password.trim())){ 
//	           this.addFieldError("mobile", "手机号不能为空"); 
//	        }else{ 
//	        if(!Pattern.compile("^1[3,5,8]\\d{9}$").matcher(this.age).matches()){ 
//	                this.addFieldError("mobile","手机号格式不正确") ;   
//	            } 
//	        } 
//	       super.validate(); 
//	    } 
	
	


}