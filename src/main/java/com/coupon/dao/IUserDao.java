package com.coupon.dao;

import com.coupon.pojo.User;

/**
 * Dao接口层，每一个方法名字对应usermapper.xml里面的ID值
 * @Title
 * @ClassName:IUserDao
 * @author Luffy
 * @Description:TODO(用一句话描述这个类作用)
 * @date 2018年1月22日 下午3:37:20
 */
public interface IUserDao {
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}