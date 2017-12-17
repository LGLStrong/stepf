package cn.com.footprint.stepf.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.footprint.stepf.dao.IUserDao;
import cn.com.footprint.stepf.entity.User;
import cn.com.footprint.stepf.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
}
