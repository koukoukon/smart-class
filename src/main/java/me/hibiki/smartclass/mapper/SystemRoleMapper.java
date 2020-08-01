package me.hibiki.smartclass.mapper;

import me.hibiki.smartclass.domain.SystemRole;

import java.util.List;

public interface SystemRoleMapper {
    int deleteSystemRoleById(Integer roleId);

    int insertSystemRole(SystemRole role);

    SystemRole getSystemRoleById(Integer roleId);

    int updateSystemRoleById(SystemRole record);

    List<SystemRole> listSystemRoles(SystemRole systemRole);

}