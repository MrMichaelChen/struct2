package processAction;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	// 需要校验的字段必需在类中提供相应的字段和相应的get,set方法
	private String email;
	private String password;
	private String repassword;
	private String phone;

	public String execute() throws Exception {
		if(email!=null) {
			return SUCCESS;
		}
		else {
			return "input";
		}
	}

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