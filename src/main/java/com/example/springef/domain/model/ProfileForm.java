package com.example.springef.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProfileForm
{
    private String name;
    private String email;
    private LocalDate birthDate;
    private List<String> wishes = new ArrayList<>();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

    public List<String> getWishes()
    {
        return wishes;
    }

    public void setWishes(List<String> wishes)
    {
        this.wishes = wishes;
    }
}
