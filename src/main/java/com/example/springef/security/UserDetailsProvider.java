package com.example.springef.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsProvider
{
    public static String getCurrentUserName()
    {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails)
        {
            return ((UserDetails) principal).getUsername();
        }
        else
        {
            return principal.toString();
        }
    }
}
