package com.example.springef.executors;

import com.example.springef.domain.model.User;
import com.example.springef.domain.repositories.UsersMyBatisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainExecutor
{
    @Autowired
    private UsersMyBatisRepository usersMyBatisRepository;

    public void execute()
    {
        User user = usersMyBatisRepository.getUser(1L);
        System.out.println(user.toString());

        List<User> allUsers = usersMyBatisRepository.getAllUsers();
        System.out.println(allUsers);
    }
}
