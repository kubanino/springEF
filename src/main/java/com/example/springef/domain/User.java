package com.example.springef.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class User
{
    private final String name;
    private final String surname;
    private final String email;

    public User(final String name, final String surname, final String email)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getEmail()
    {
        return email;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(name, surname, email);
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("surname", surname)
                .append("email", email)
                .toString();
    }
}
