<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
      
    <title>My JSP 'index.jsp' starting page</title>  
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
  <center>  
<div>  
<h1>欢迎登陆</h1>  
<form action="LoginServlet" method="post">  
    <table>  
    <tr>  
    <td align="right"><font size="3">账号：</font></td><td colspan="2"><input type="text" name="idnum"  style="width:200;height:25;"/></td>  
    </tr>    
    <tr>  
    <td align="right"><font size="3">密码：</font></td><td colspan="2"><input type="text" name="password"  style="width:200;height:25;"/></td>  
    </tr>
    <tr>  
    <td width="66" align="right"><font size="3">姓名：</font></td><td colspan="2"><input type="text" name="username" value="${username }" style="width:200;height:25;"/></td>  
    </tr>  
    <tr>  
    <td align="right"><font size="3">手机：</font></td><td colspan="2"><input type="text" name="phone"  style="width:200;height:25;"/></td>  
    </tr>  
    <tr><td colspan="3" align="center"><input type="submit" value="登录" style="width:130;height:30;"/></td></tr>  
    </table>  
    </form>  
    <a href="regist.jsp"><font size="2"><i>没有帐号？点击注册</i></font></a>  
<font color="red" size="2"> ${msg }</font>  
</div>  
</center>  
  </body>  
</html>  