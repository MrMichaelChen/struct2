<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
  <title>用户下载测试文件</title>
</head>
<body> 
   <s:form action="download" method="post" enctype="multipart/form-data">  
       <a href="download?woaixushengchen">点击我下载测试文件</a>   
    </s:form>     
</body>
</html>