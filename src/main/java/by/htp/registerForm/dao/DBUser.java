package by.htp.registerForm.dao;

import java.util.List;

import by.htp.registerForm.bean.User;

public interface DBUser {
	
	public List<User> getUsers();

	public void saveUser(User user);

	public User getUser(int userId);

	public void deleteUser(int userId);
}
