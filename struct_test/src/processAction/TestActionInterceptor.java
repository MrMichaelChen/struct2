package processAction;

import java.util.*;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
public class TestActionInterceptor extends AbstractInterceptor {

	
	private String userName="";

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Map session = invocation.getInvocationContext().getSession();
		String userName = (String) session.get("USER_NAME");
		System.out.println(userName);
        if (userName.endsWith("r")) {

            System.out.println("À¹½ØÆ÷£ººÏ·¨ÓÃ»§µÇÂ¼---");

            //return "success";
            return invocation.invoke();
        } else {

            System.out.println("À¹½ØÆ÷£ºÓÃ»§Î´µÇÂ¼---");

            return "input";
        }
	}

}
