<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="js/login.js"></script>
<body>

<s:form action="verify" id="loginForm">

	<s:textfield name="uname" placeholder="Username" /><br>
	<s:password name="password" placeholder="Password" /><br>
     
    <div class="loginButton" style="cursor: pointer;" onclick="submit();">Login</div>



</s:form>
<jsp:include page="/WEB-INF/pages/navigation.jsp"></jsp:include>
</body>
</html>