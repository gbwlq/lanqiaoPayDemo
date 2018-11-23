package org.lanqiao.service.impl;

import org.lanqiao.entity.User;
import org.lanqiao.mapper.UserMapper;
import org.lanqiao.service.UserService;

public class UserServiceImpl implements UserService{
	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User queryUserByName(String userName) {
		User user = userMapper.queryUserByName(userName);
		return user;
	}

	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
		
	}

	@Override
	public void deleteUserByName(String userName) {
		userMapper.deleteUserByName(userName);
		
	}

	@Override
	public User queryUserByEmail(String email) {
		User user = userMapper.queryUserByEmail(email);
		return user;
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
		
	}
	/**
	 * 判断用户名是否存在
	 */
	@Override
	public boolean isExist(String userName) {
		boolean flag = false;
		if(queryUserByName(userName)!=null) {//用户存在
			flag = true;
		}
		return flag;
	}
	/**
	 * 判断密码是否正确
	 */
//	public boolean passwordIsRight(String userName,String password) {
//		boolean flag = false;
//		if(isExist(userName)) {
//			User user = queryUserByName(userName);
//			if(password.equals(user.getPassWord())) {//密码正确
//				flag=true;
//			}
//		}
//		return flag;
//	}

	@Override
	public void addUserEmail(String email) {
		userMapper.addUserEmail(email);
		
	}

	@Override
	public void updateWithUserIDAndName(User user) {
		userMapper.updateWithUserIDAndName(user);
		
	}

	@Override
	public void updateWithPassWord(User user) {
		userMapper.updateWithPassWord(user);
		
	}
}
