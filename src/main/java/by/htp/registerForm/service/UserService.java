package by.htp.registerForm.service;

import java.util.List;

import by.htp.registerForm.bean.User;

public interface UserService {
	
	public List<User> getUsers();

	public void saveUser(User user);

	public User getUser(int userId);

	public void deleteUser(int userId);
}
