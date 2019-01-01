package com.example.springef.domain.mappers;

import com.example.springef.domain.model.User;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper extends AbstractDomainMapper<User>
{
    User getUser(@Param("userId") Long userId);
}
