<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>没成功</title>
</head>
<body>
<script type="text/javascript">
			var username="<%=session.getAttribute("USER_NAME")%>";
			if (username != undefined){
				document.write("您的用户名是"+username);
			}
		</script> 
<h1>没成功！</h1>
</body>
</html>