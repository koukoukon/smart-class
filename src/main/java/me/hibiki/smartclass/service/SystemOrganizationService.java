package me.hibiki.smartclass.service;

import me.hibiki.smartclass.domain.SystemOrganization;

import java.util.List;

public interface SystemOrganizationService{


    int deleteByPrimaryKey(Integer organizationId);

    int insert(SystemOrganization record);

    int insertSelective(SystemOrganization record);

    SystemOrganization selectByPrimaryKey(Integer organizationId);

    int updateByPrimaryKeySelective(SystemOrganization record);

    int updateByPrimaryKey(SystemOrganization record);

    List<SystemOrganization> listSystemOrganizations();
}
