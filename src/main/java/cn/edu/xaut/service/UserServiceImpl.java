package cn.edu.xaut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.xaut.dao.UserDAO;
import cn.edu.xaut.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	User user;
	@Autowired
	UserDAO userDAO;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public String toString() {
		return "UserServiceImpl [user=" + user + ", userDAO=" + userDAO + "]";
	}

	public void addUser() {
		this.userDAO.addUser(this.user);
	}

	public void addCouple() {
		
		this.userDAO.addUser(this.user);
		User wife = new User();
		wife.setUsername(this.user.getUsername()+"'s wife");
		wife.setPassword(this.user.getPassword());
		if(false)
			throw new RuntimeException("ณ๖ดํมห");	
		this.userDAO.addUser(wife);
		
	}
	
}
