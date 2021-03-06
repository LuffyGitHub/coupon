package com.coupon.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coupon.dao.IUserDao;
import com.coupon.pojo.User;
import com.coupon.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService {

	
	@Resource  
	private IUserDao userDao;  

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
