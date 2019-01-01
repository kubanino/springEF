package com.example.springef.domain.mappers;

import java.util.List;

public interface AbstractDomainMapper<T>
{
    List<T> getAll();
}
