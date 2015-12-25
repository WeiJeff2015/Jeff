package com.jeff.userManager.dao;

import java.util.List;

import com.jeff.userManager.bo.User;

/**
 * 
 * Description: 用户dao
 * All Rights Reserved.
 * @version 1.0  2015年12月25日 下午12:37:54  by  weihuining（hnwei@mo9.com）创建
 */
public interface UserDao {

	
	public void insertUser(User user);
	
	public List<User> queryByUser(User user);
	
	public void modifyUser(User user);
}
