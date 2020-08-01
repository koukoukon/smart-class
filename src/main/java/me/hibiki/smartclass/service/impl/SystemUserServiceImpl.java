package me.hibiki.smartclass.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import me.hibiki.smartclass.domain.SystemUser;
import me.hibiki.smartclass.mapper.SystemUserMapper;
import me.hibiki.smartclass.service.SystemUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SystemUserServiceImpl implements SystemUserService {

    @Resource
    private SystemUserMapper systemUserMapper;

    @Override
    public int removeSystemUserByUserId(Integer userId) {
        int i = systemUserMapper.deleteSystemUserByUserId(userId);
        System.out.println("影响的行数"+i);
        return i;
    }
    @Override
    public SystemUser getSystemUserByUserId(Integer userId) {
        return systemUserMapper.getSystemUserByUserId(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(SystemUser record) {
        return systemUserMapper.updateByPrimaryKeySelective(record);
    }



    @Override
    public PageInfo<SystemUser> listSystemUsers(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(systemUserMapper.listSystemUsers());
    }

    @Override
    public SystemUser getUserByLogin(String userName, String userPassword) {
        return systemUserMapper.getUserByLogin(userName,userPassword);
    }

    @Override
    public int saveSystemUser(SystemUser systemUser) {
        return systemUserMapper.insertSystemUser(systemUser);
    }
}
