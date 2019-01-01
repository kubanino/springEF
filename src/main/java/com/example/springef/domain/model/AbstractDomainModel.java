package com.example.springef.domain.model;

public abstract class AbstractDomainModel
{
    public static final Long DEFAULT_ID = -1L;

    private Long id;


    protected AbstractDomainModel(final Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    abstract static class Builder<T extends Builder<T>>
    {
        Long id = DEFAULT_ID;

        public T withId(final Long id)
        {
            this.id = id;
            return self();
        }

        abstract AbstractDomainModel build();

        protected abstract T self();
    }
}
