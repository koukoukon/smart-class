package me.hibiki.smartclass.service.impl;

import me.hibiki.smartclass.domain.SystemOrganization;
import me.hibiki.smartclass.mapper.SystemOrganizationMapper;
import me.hibiki.smartclass.service.SystemOrganizationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SystemOrganizationServiceImpl implements SystemOrganizationService {

    @Resource
    private SystemOrganizationMapper systemOrganizationMapper;

    @Override
    public int deleteByPrimaryKey(Integer organizationId) {
        return systemOrganizationMapper.deleteByPrimaryKey(organizationId);
    }

    @Override
    public int insert(SystemOrganization record) {
        return systemOrganizationMapper.insert(record);
    }

    @Override
    public int insertSelective(SystemOrganization record) {
        return systemOrganizationMapper.insertSelective(record);
    }

    @Override
    public SystemOrganization selectByPrimaryKey(Integer organizationId) {
        return systemOrganizationMapper.selectByPrimaryKey(organizationId);
    }

    @Override
    public int updateByPrimaryKeySelective(SystemOrganization record) {
        return systemOrganizationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SystemOrganization record) {
        return systemOrganizationMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SystemOrganization> listSystemOrganizations() {
        return systemOrganizationMapper.listSystemOrganizations();
    }
}
