package org.yufan.mapper;

import java.util.List;
import java.util.Map;

import org.yufan.bean.Role;

public interface RoleMapper {
/**
 * @author Administrator
 * @param roleId
 * @return
 */
	public Role findRoleById(Integer roleId);

	public void saveRole(Role role);

	public void updateRole(Role role);

	public void deleteRoleById(Integer roleId);

	public List<Role> queryRoleByWhere(Role record);
	
	public List<Role> queryRoleList();
	
	/**
	 * 删除角色对应的权限  中间表
	 * @param roleId
	 */
	public void deleteRolePrivilegeRelation(Integer roleId);
	
	/**
	 * 权限id  角色id
	 * @param paramter
	 */
	public void insertRolePrivilegeRelation(Map<String,Integer> paramter);
}
