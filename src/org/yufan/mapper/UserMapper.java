package org.yufan.mapper;

import java.util.List;
import java.util.Map;

import org.yufan.bean.User;

public interface UserMapper {
	/**
	 * @author Administrator
	 * @param record
	 * @return
	 */
	public User findUserById(Integer id);
	
	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUserById(Integer Id);

	public List<User> queryUserByWhere(User record);
	
	public List<User> queryUserList();
	
	/**
	 * 删除用户对应的角色  中间表
	 * @param roleId
	 */
	public void deleteUserRoleRelation(Integer userId);
	
	/**
	 * 角色id  用户id
	 * @param paramter
	 */
	public void insertUserRoleRelation(Map<String,Integer> paramter);
	
}
