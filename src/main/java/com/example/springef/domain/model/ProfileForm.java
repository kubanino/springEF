package com.example.springef.domain.model;

import com.example.springef.annotations.PastLocalDate;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProfileForm
{
    @Size
    @NotEmpty
    private String name;

    @Email
    @NotEmpty
    private String email;

    @NotNull
    @PastLocalDate
    private LocalDate birthDate;

    // @NotEmpty
    private List<String> wishes = new ArrayList<>();

    private List<String> tastes = new ArrayList<>();

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

    public List<String> getTastes()
    {
        return tastes;
    }

    public void setTastes(List<String> tastes)
    {
        this.tastes = tastes;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("email", email)
                .append("birthDate", birthDate)
                .append("wishes", wishes)
                .append("tastes", tastes)
                .toString();
    }
}
