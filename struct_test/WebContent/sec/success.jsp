<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>成功</title>
</head>
<body>
<h1>成功！</h1>
<script type="text/javascript">
			var username="<%=session.getAttribute("USER_NAME")%>";
			if (username != ''){
				document.write("您的用户名是"+username);
			}
			else{
				document.write("系统没有收到有效用户名哦")
			}
		</script> 
<form action="checkuser.action" method="post">
<h3>拦截器验证页面</h3>
<td><input type="submit" value="<s:text name="form.submit" />"/></td>
</form>
</body>
</html>