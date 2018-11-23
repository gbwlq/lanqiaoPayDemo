package org.lanqiao.mapper;

import org.lanqiao.entity.User;

public interface UserMapper {
	public User queryUserByName(String userName);//根据用户名查询
	public User queryUserByEmail(String email);//查询电子邮箱
	public void addUser(User user);//增加
	public void addUserEmail(String email);//增加电子邮箱
	public void updateWithUserIDAndName(User user);//身份证号，姓名
	public void updateWithPassWord(User user);//密码
	public void deleteUserByName(String userName);//删除
	public void updateUser(User user);//修改
	
}
