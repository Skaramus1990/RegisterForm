<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>List Users</title>
<style>
td {
	text-align: center;
}
</style>
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Список пользователей</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<form>
				<table>
					<tr>
						<th>Имя</th>
						<th>Логин</th>
						<th>Пароль</th>
						<th>Дата рождения</th>
						<th>Город</th>
						<th>Телефон</th>
						<th></th>
						<th><input formaction="delete" type="submit" name="button"
							value="Удалить"
							onclick="if (!(confirm('Are you sure you want to delete this user?'))) return false"></th>
					</tr>
					
					<c:forEach var="tempUser" items="${users}">
						<c:url var="updateLink" value="showFormForUpdate">
							<c:param name="updateUser" value="${tempUser.id}" />
						</c:url>
					<tr>
						<td>${tempUser.name}</td>
						<td>${tempUser.login}</td>
						<td>${tempUser.password}</td>
						<td>${tempUser.userInformation.date_of_birth}</td>
						<td>${tempUser.userInformation.city}</td>
						<td>${tempUser.userInformation.phone}</td>
						<td><a href="${updateLink}">Обновить</a></td>
						<td><input type="checkbox" name="deleteUsersParam" value=${tempUser.id} /></td>
					</tr>
					</c:forEach>
				</table>
					<a href="velcome">На главную</a>
			</form>
		</div>
	</div>
</body>

</html>









