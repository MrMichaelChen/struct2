package processAction;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
import org.apache.struts2.interceptor.SessionAware;

public class curlAction extends ActionSupport implements SessionAware {

	private int num1;
	private int num2;
	private int resultnum;
	private String flag;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	private Map session;

	public void setSession(Map session) {
		this.session = session;
	}

	@Override
	public String execute() throws Exception {
		if (num1 != 0 || num2 != 0) {
			if (flag.equals("+")) {
				resultnum = num1 + num2;
			}
			if (flag.equals("*")) {
				resultnum = num1 * num2;
			}
			if (flag.equals("-")) {
				resultnum = num1 - num2;
			}
			if (flag.equals("/")) {
				resultnum = num1 / num2;
			}
			this.session.put("RESULT", resultnum);
			return SUCCESS;
		} else {
			return "fail";
		}
	}

}
