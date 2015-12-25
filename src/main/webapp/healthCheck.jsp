<%@ page session="false"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>
<html> 


<script type="text/javascript">
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;  
%>
	function toMainPage(){
		window.location.href="<%=basePath%>/main/toMainPage.do_";
	}
</script>
<p>node health check success!</p>

<button onclick="javascript:toMainPage();"> hi </button>
</html>