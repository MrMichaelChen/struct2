<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
  <title>用户登录</title>
</head>
<body> 
   <s:form action="multiUpload" method="post" namespace="/test3" enctype="multipart/form-data">  
       <s:file name="uploadfile" label="文件1"></s:file>  
       <s:file name="uploadfile" label="文件2"></s:file>  
       <s:file name="uploadfile" label="文件3"></s:file>  
       <s:file name="uploadfile" label="文件4"></s:file>  
       <s:submit value="上传"></s:submit>  
    </s:form>     
</body>
</html>