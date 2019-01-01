package com.example.springef.executors;

import com.example.springef.domain.model.User;
import com.example.springef.domain.repositories.UsersMyBatisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainExecutor
{
    @Autowired
    private UsersMyBatisRepository usersMyBatisRepository;

    public void execute()
    {
        // Test User object
        User user = usersMyBatisRepository.getUser(1L);

        System.out.println(user.toString());
    }
}
