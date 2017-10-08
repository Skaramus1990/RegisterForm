package by.htp.registerForm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import by.htp.registerForm.bean.User;
import by.htp.registerForm.bean.UserInformation;
import by.htp.registerForm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userServiceImpl;

	@RequestMapping("/velcome")
	public String velcomePage(Model theModel) {
		return "velcom";
	}

	@RequestMapping("/list")
	public String listUsers(Model theModel) {
		List<User> users = userServiceImpl.getUsers();
		theModel.addAttribute("users", users);
		return "list-user";
	}

	@RequestMapping(value = "/registerUser/saveUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User theUser) {
		try {
			userServiceImpl.saveUser(theUser);
		} catch (Exception e) {
			return "redirect:/registerUser";
		}
		return "redirect:/velcome";
	}

	@GetMapping("/registerUser")
	public String registerUser(Model theModel) {
		UserInformation info = new UserInformation();
		User theUser = new User();
		theUser.setUserInformation(info);
		theModel.addAttribute("user", theUser);
		return "register";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("updateUser") String userId, Model theModel) {
		User theUser = userServiceImpl.getUser(Integer.parseInt(userId));
		theModel.addAttribute("user", theUser);
		return "user-form";
	}

	@GetMapping("/delete")
	public String deleteUser(@RequestParam("deleteUsersParam") String deleteUsers) {
		String[] arg = deleteUsers.split(",");
		for (int i = 0; i < arg.length; i++) {
			userServiceImpl.deleteUser(Integer.parseInt(arg[i]));
		}

		return "redirect:/list";
	}
}
