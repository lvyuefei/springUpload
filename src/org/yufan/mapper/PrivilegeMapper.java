package org.yufan.mapper;

import java.util.List;

import org.yufan.bean.Privilege;

/**
 * 
 * @author Administrator
 *
 */
public interface PrivilegeMapper {

	public Privilege findPrivilegeById(Integer privilegeId);

	public void savePrivilege(Privilege privilege);

	public void updatePrivilege(Privilege privilege);

	public void deletePrivilegeById(Integer privilegeId);

	public List<Privilege> queryPrivilegeByWhere(Privilege record);
}
