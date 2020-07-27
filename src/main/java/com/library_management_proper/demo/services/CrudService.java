package com.library_management_proper.demo.services;

import java.util.Set;

public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);
    void deleteById(ID id);
}
