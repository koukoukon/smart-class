package me.hibiki.smartclass.mapper;

import me.hibiki.smartclass.domain.SystemUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemUserMapper {
    int deleteSystemUserByUserId(Integer userId);

    int insertSystemUser(SystemUser systemUser);
    SystemUser getSystemUserByUserId(Integer userId);
    int updateByPrimaryKeySelective(SystemUser record);

    List<SystemUser> listSystemUsers();
    SystemUser getUserByLogin(@Param("userName") String userName,@Param("userPassword") String userPassword);
}