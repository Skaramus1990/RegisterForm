<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Velcome page</title>
</head>
<body>
	<c:url var="register" value="registerUser"></c:url>
	<c:url var="showUsers" value="list"></c:url>
	<a href="${register}">Регистрация</a><br>
	<a href="${showUsers}">Управление пользователями</a>
</body>
</html>