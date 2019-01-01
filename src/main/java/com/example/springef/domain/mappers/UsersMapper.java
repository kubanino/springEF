package com.example.springef.domain.mappers;

import com.example.springef.domain.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersMapper
{
    @Select("SELECT * FROM ef_users WHERE id = #{userId}")
    User getUser(@Param("userId") Long userId);
}
