package processAction;

import com.opensymphony.xwork2.ActionSupport;

public class registerAction extends ActionSupport {
    /**
	 * 
	 */
	private String username;
    private String password;
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

    public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
    public String execute() throws Exception {
        
		if (username=="123") {
            System.out.println(username);
            return "fail";
        } else {
        	System.out.println(username);
        	System.out.println(password);
        	System.out.println(age);
        	return SUCCESS;
        }
    }
}