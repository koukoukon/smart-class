package me.hibiki.smartclass.mapper;

import me.hibiki.smartclass.domain.SystemOrganization;

import java.util.List;

public interface SystemOrganizationMapper {
    int deleteByPrimaryKey(Integer organizationId);

    int insert(SystemOrganization record);

    int insertSelective(SystemOrganization record);

    SystemOrganization selectByPrimaryKey(Integer organizationId);

    int updateByPrimaryKeySelective(SystemOrganization record);

    int updateByPrimaryKey(SystemOrganization record);
    List<SystemOrganization> listSystemOrganizations();
}