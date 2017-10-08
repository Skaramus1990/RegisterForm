package by.htp.registerForm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.htp.registerForm.bean.User;
import by.htp.registerForm.dao.DBUser;
import by.htp.registerForm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private DBUser dbUser;

	@Override
	@Transactional
	public List<User> getUsers() {
		return dbUser.getUsers();
	}

	@Override
	@Transactional
	public void saveUser(User user) {
		dbUser.saveUser(user);
	}

	@Override
	@Transactional
	public User getUser(int userId) {
		return dbUser.getUser(userId);
	}

	@Override
	@Transactional
	public void deleteUser(int userId) {
		dbUser.deleteUser(userId);
	}

}
