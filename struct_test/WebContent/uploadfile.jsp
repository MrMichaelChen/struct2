<%@ page language="java" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login_suc.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <%-- File upload;String uploadContentType;
  String uploadFileName; --%>
  <s:form name="uploadForm" action="fileUpload" enctype="multipart/form-data">
    <s:file name="uploadfile" label="文件"/>
    <s:file name="uploadfile" label="文件1"></s:file>  
    <s:file name="uploadfile" label="文件2"></s:file>  
    <s:file name="uploadfile" label="文件3"></s:file>  
    <s:file name="uploadfile" label="文件4"></s:file> 
    <s:submit/>
  </s:form>
  </body>
