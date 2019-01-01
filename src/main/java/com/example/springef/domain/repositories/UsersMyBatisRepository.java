package com.example.springef.domain.repositories;

import com.example.springef.domain.mappers.UsersMapper;
import com.example.springef.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersMyBatisRepository
{
    @SuppressWarnings({"SpringJavaAutowiredFieldsWarningInspection", "SpringJavaInjectionPointsAutowiringInspection"})
    @Autowired
    private UsersMapper userMapper;

    public User getUser(final Long userId)
    {
        return userMapper.getUser(userId);
    }

    public List<User> getAllUsers()
    {
        return userMapper.getAll();
    }
}
