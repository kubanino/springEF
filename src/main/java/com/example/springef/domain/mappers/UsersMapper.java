package com.example.springef.domain.mappers;

import com.example.springef.domain.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper
{
    User getUser(@Param("userId") Long userId);
}
