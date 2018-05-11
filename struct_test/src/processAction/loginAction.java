package processAction;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

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

	@SuppressWarnings("rawtypes")
	private Map session;

	public void setSession(Map session) {
		this.session = session;
	}

	@Override
	public String execute() throws Exception {
		if (username.equals("admin") && password.equals("123")) {
			this.session.put("USER_NAME", username);
			this.session.put("PASS_WORD", password);
			return SUCCESS;
		} else {
			this.session.put("USER_NAME", username);
			this.session.put("PASS_WORD", password);
			return "fail";
		}
	}
}
