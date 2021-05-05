package cn.edu.xaut.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import cn.edu.xaut.entity.User;

public interface UserDAO {
	
	public void addUser(User user);
	public List<User> getAllUsers();
	
}
