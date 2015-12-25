package com.jeff.userManager.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.jeff.common.utils.codeUtil.Encrypt;
import com.jeff.userManager.bo.User;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:ApplicationContext.xml"})
public class UserDaoTest {


	@Autowired
	public UserDao userDao;
	

	@Test
	@Rollback(false)
	public void testInsertUser(){
		Assert.notNull(userDao);
		User user = new User();
		user.setPhone("13500000000");
		String password = "sha20151219";
		String encodedPassword = Encrypt.sha1Encode(password);
		System.out.println("encodedPassword: "+encodedPassword);
		user.setLoginPwd(encodedPassword);
		user.setName("大哥");
		user.setAge(30);
		user.setCity("上海");
		user.setProvince("上海");
		user.setStatus(0);
		user.setSex(1);
		user.setSummary("世界互联网大会");
		userDao.insertUser(user);
		
	}
	
	@Test
	@Rollback(false)
	public void testModifyUser(){
		Assert.notNull(userDao);
		User user = new User();
		user.setStatus(1);
		userDao.modifyUser(user);
	}
	
	
	public void testQueryByUser(){
		Assert.notNull(userDao);
		User user = new User();
	}
	
	

	
}
