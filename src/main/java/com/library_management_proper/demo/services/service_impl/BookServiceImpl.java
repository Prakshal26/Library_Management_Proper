package com.library_management_proper.demo.services.service_impl;

import com.library_management_proper.demo.models.Book;
import com.library_management_proper.demo.repositories.BookRepository;
import com.library_management_proper.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {

    BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Set<Book> findAll() {
        Set<Book> bookSet = new HashSet<>();
        bookRepository.findAll().forEach(bookSet :: add);
        return bookSet;
    }

    @Override
    public Book findById(Long aLong) {
        return null;
    }

    @Override
    public Book save(Book object) {
        return bookRepository.save(object);
    }

    @Override
    public void delete(Book object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
