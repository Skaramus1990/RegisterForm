<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<title>Register User</title>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Форма регистрации пользователя</h2>
		</div>
	</div>

	<div id="container">
		<form:form action="registerUser/saveUser" modelAttribute="user" method="POST">
			<table>
				<tbody>
					<tr>
						<td><label>Имя:</label></td>
						<td><form:input path="name" required="true" /></td>
					</tr>

					<tr>
						<td><label>Логин:</label></td>
						<td><form:input path="login" required="true" /></td>
					</tr>

					<tr>
						<td><label>Пароль:</label></td>
						<td><form:input path="password" required="true" /></td>
					</tr>
						<tr>
						<td><label>Дата рождения:</label></td>
						<td><form:input path="userInformation.date_of_birth" placeholder="Формат yyyy-mm-dd"  required="true" /></td>
					</tr>
						<tr>
						<td><label>Город:</label></td>
						<td><form:input path="userInformation.city" required="true" /></td>
					</tr>
						<tr>
						<td><label>Телефон:</label></td>
						<td><form:input path="userInformation.phone" required="true" /></td>
					</tr>
					
					<tr>
						<td><input type="submit" value="Сохранить" class="save" /></td>
						<td><input formaction="velcome" type="submit" value="Обратно" class="velcome" /></td>
					</tr>

				</tbody>
			</table>

		</form:form>

	</div>
</body>

</html>