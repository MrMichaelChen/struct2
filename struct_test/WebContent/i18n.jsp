<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<s:head/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><s:text name="title" /></title>
</head>
<body>
    <form action="Register.action" method="post">
        <table> 
            <tr>
                <!-- 把和显示相关的文字都替换成  <s:text name="对应资源文件的键"/> -->
                <td><s:text name="form.email" /></td>
                <td><input type="text" name="email"/></td>
                <!-- 使用<s:fielderror/>标签输入相应的字段错误信息 -->
                <td><s:fielderror fieldName="email"/></td>
            </tr>
            <tr>
                <!-- 把和显示相关的文字都替换成  <s:text name="对应资源文件的键"/> -->
                <td><s:text name="form.password" /></td>
                <td><input type="password" name="password"/></td>
                <td><s:fielderror fieldName="password"/></td>
            </tr>
            <tr>
                <td><s:text name="form.repassword" /></td><td>
                <input type="password" name="repassword"/></td>
                <td><s:fielderror fieldName="repassword"/></td>
            </tr>
            <tr>
                <td><s:text name="form.phone" /></td>
                <td><input type="text" name="phone"/></td>
                <td><s:fielderror fieldName="phone"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="<s:text name="form.submit" />"/></td>
                <td></td>
                <td></td>
            </tr>
        </table>
    </form>
</body>
</html>