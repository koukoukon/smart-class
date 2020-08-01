package me.hibiki.smartclass.mapper;

import me.hibiki.smartclass.domain.SystemMenu;

import java.util.List;

public interface SystemMenuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(SystemMenu record);

    int insertSelective(SystemMenu record);

    SystemMenu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(SystemMenu record);

    int updateByPrimaryKey(SystemMenu record);
    List<SystemMenu> listSystemMenus();
    List<SystemMenu> listByRolePidSystemMenus(Integer rolePid);
}