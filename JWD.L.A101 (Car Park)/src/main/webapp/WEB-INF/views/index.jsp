<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/login" method="post">
		<label for="user"> UserName: </label> <input id="username"
			name="username" id="username"> <br> <br> <label
			for="password"> Password: </label> <input id="password" name="password"
			id="password"><br> <input type="submit" value="Đăng Nhập">
	</form>
</body>
</html>