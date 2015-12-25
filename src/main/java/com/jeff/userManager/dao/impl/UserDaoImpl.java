package com.jeff.userManager.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jeff.base.dao.JeffIbatisDao;
import com.jeff.userManager.bo.User;
import com.jeff.userManager.dao.UserDao;

@Repository(value="userDao")
public class UserDaoImpl extends JeffIbatisDao implements UserDao{

	@Override
	public void insertUser(User user) {
		getSqlMapClientTemplate().insert("sql.user.insertUser", user);
		
	}

	@Override
	public List<User> queryByUser(User user) {
		return getSqlMapClientTemplate().queryForList("sql.user.queryByUser", user);
	}

	@Override
	public void modifyUser(User user) {
		getSqlMapClientTemplate().update("sql.user.modifyUser", user);
	}
 
 

}
