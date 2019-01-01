package com.example.springef.domain.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class User extends AbstractDomainModel
{
    private final String name;
    private final String surname;
    private final String email;

    // Used only by mappers
    @Deprecated
    public User(final Long id, final String name, final String surname, final String email)
    {
        super(id);
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public User(final Builder builder)
    {
        super(builder.id);
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
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

    public static class Builder extends AbstractDomainModel.Builder<Builder>
    {
        private String name;
        private String surname;
        private String email;

        public Builder withName(final String name)
        {
            this.name = name;
            return this;
        }

        public Builder withSurname(final String surname)
        {
            this.surname = surname;
            return this;
        }

        public Builder withEmail(final String email)
        {
            this.email = email;
            return this;
        }

        @Override
        User build()
        {
            return new User(this);
        }

        @Override
        protected Builder self()
        {
            return this;
        }
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
                .append("id", getId())
                .append("name", name)
                .append("surname", surname)
                .append("email", email)
                .toString();
    }
}
