package com.library_management_proper.demo.services.service_impl;

import com.library_management_proper.demo.models.BookType;
import com.library_management_proper.demo.repositories.BookTypeRepository;
import com.library_management_proper.demo.services.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BookTypeServiceImpl implements BookTypeService {

    BookTypeRepository bookTypeRepository;

    @Autowired
    public BookTypeServiceImpl(BookTypeRepository bookTypeRepository) {
        this.bookTypeRepository = bookTypeRepository;
    }

    @Override
    public Set<BookType> findAll() {

        Set<BookType> bookTypes = new HashSet<>();
        bookTypeRepository.findAll().forEach(bookTypes::add);
        return bookTypes;
    }

    @Override
    public BookType findById(Long aLong) {
        return null;
    }

    @Override
    public BookType save(BookType object) {
        return bookTypeRepository.save(object);
    }

    @Override
    public void delete(BookType object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
